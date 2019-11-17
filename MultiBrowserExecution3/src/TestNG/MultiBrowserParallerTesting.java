package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserParallerTesting {
	WebDriver driver;
	String url = "https://www.edureka.co/";
@Parameters("browserType")	
  @Test
  public void invokeBrowser(String browserType) {
	  browserType = browserType.trim();
	 
	  if(browserType.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
	  if(browserType.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.navigate().to("https://www.google.com/");
	  }
	  
	  if(browserType.equalsIgnoreCase("internetExplorer")) {
		  System.setProperty("webdriver.ie.driver","C:\\Selenium_Jars\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		 
		  WebDriver driver=new InternetExplorerDriver();
		  driver.navigate().to("https://www.edureka.co/");
	  }
	  else {
		  System.out.println("Invalid browser");
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
		  
  }
}

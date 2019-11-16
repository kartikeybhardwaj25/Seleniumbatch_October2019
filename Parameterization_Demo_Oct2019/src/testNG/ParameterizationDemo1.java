package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo1 {
	WebDriver driver;
	
@BeforeMethod
public void OpenBrowser() {
	
	String url ="https://www.facebook.com/";
	 System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
}
  @Parameters({"user","pass"})	
  @Test
  public void loginfacebook(String username,String password) {
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("pass")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	  
	  
	  
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
  
}

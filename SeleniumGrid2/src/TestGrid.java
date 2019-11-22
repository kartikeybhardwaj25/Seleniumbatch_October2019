import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	
	static WebDriver driver;
	static String nodeUrl;
	public static void main(String[] args) throws MalformedURLException {
		nodeUrl ="http://192.168.1.9:33862/wd/hub";
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL(nodeUrl),capabilities);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		driver.findElement(By.linkText("Today's Deals")).click();

	}

}

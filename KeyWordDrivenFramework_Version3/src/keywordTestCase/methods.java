package keywordTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class methods {
	
	static WebDriver driver;
	
	public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	}
	  
	public static void maximizeWindow() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public static void implementWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void navigateTo(String baseUrl) {
		driver.get(baseUrl);
	}
	  
	public static void enterUsername(String value,String param) {
		driver.findElement(By.name(value)).sendKeys(param);
	}
	
	public static void enterpassword(String value,String param) {
		driver.findElement(By.name(value)).sendKeys(param);
	}
	
	public static void ClickSubmit(String value) {
		driver.findElement(By.name(value)).click();
	}
	
	public static void VerifyMessage(String value,String message) {
		String expectedMessage =message;
		
		String actualMessage = driver.findElement(By.xpath(value)).getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);
		
		
	}
	
	public static void closebrowser() {
		driver.close();
	}
	  
	  

}

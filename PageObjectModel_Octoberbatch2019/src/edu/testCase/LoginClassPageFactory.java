package edu.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import edu.pages.WebElement_Pagefactory;

public class LoginClassPageFactory {
	
  @Test
  public void loginVerify() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	
	  
	  driver.get("http://www.newtours.demoaut.com/");
	  
	  //created object for pagefactory class
	  WebElement_Pagefactory locateElements = PageFactory.initElements(driver, WebElement_Pagefactory.class);
	  
	  locateElements.loginMethod("edureka", "edureka123");
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
	  
	  
  }
}

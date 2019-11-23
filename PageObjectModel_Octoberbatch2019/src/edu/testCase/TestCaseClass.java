package edu.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import edu.pages.LoginElements;

public class TestCaseClass {
  @Test
  public void verifyLogin() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	
	  
	  driver.get("http://www.newtours.demoaut.com/");
	  
	  //create object for LoginElement Class
	  
	  LoginElements login = new LoginElements(driver);
	  
	  login.userle("edureka");
	  login.passele("edureka123");
	  login.loginele();
	  
	  Thread.sleep(5000);
	  
	  
	  driver.quit();
	  
	  
  }
}

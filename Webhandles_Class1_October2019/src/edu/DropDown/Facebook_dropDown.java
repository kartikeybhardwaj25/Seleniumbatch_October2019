package edu.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //Select for dropdown
		  
		  Select dropDown = new Select(driver.findElement(By.id("month")));
		  
		  dropDown.selectByIndex(0);
		  
		  Thread.sleep(3000);
		  dropDown.selectByVisibleText("Apr");
		  
		  Thread.sleep(3000);
		  
		  dropDown.selectByValue("12");
			

	}

}

package edu.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
			
			driver.get("http://www.uitestpractice.com/Students/Switchto");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
			
			
			Alert ConfirmAlert = driver.switchTo().alert();
			
			Thread.sleep(5000);
			ConfirmAlert.dismiss();

	}

}

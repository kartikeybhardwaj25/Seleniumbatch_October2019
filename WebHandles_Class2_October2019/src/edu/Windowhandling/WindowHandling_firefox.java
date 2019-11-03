package edu.Windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling_firefox {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
			
			String parentWindowHandle = driver.getWindowHandle();
			
			System.out.println("Parent window handle:" +parentWindowHandle);
			
			WebElement ClickElement = driver.findElement(By.id("button1"));
			
			for(int i=0;i<3;i++) {
				ClickElement.click();
				Thread.sleep(3000);
			}
			
			Set<String> allWindowhandles = driver.getWindowHandles();
			
			String lastWindowhandle = "";
			
			for(String handle:allWindowhandles) {
				System.out.println("Switching to Windows: "+handle);
				
				System.out.println("Navigation to google");
				
				//switch to desired window and then execute google
				
				driver.switchTo().window(handle);
				driver.get("https://www.google.com");
				
				lastWindowhandle=handle;
			}
			
			//switch to parent window
			driver.switchTo().window(parentWindowHandle);
			
			//close parent window
			driver.close();
			
			//at this point the re is no focus on window ,we need to explicitly set focus on some window
			
			driver.switchTo().window(lastWindowhandle);
			driver.get("https://www.dell.com/en-in");

	}

}

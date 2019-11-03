package edu.MousenKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MousenKeyBoard {

	public static void main(String[] args) {
		String baseurl ="https://www.facebook.com";
		
		 System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  
			WebDriver driver = new FirefoxDriver();
			driver.get(baseurl);
			
			WebElement txtUsername = driver.findElement(By.id("email"));
			
			Actions builder = new Actions(driver);
	
		//pressing SHIFT BUTTON to write a text in upper case ,context options and double click	
Action SeriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername,Keys.SHIFT).sendKeys(txtUsername,"hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
			SeriesOfActions.perform();
			

	}

}

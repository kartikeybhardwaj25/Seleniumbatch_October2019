package edu.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions {
//Test case to validate weather 2008 year exists in drop down
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //Select for dropdown
		  
		  Select oSelect = new Select(driver.findElement(By.id("year")));
		  
		  //number of options in drop down
		  List <WebElement> elementCount = oSelect.getOptions();
		  
		  System.out.println(elementCount.size());
		  
		  int isize = elementCount.size();
		  
		  //print all the values in drop down
		  for(int i=0;i<isize;i++) {
			  
			 String value =  elementCount.get(i).getText();
			 
			 //System.out.println(value);
			 
			 if(value.equals("2008")) {
				 System.out.println("TestCase passed at location " +i);
				 
				 break;
			 }
		  }
		  
		  
		  
		  

	}

}

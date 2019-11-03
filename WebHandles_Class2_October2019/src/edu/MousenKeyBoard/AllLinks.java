package edu.MousenKeyBoard;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();
        
     // Launch Website  
        driver.navigate().to("https://www.seleniumhq.org/"); 
driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        
        for(WebElement link:allLinks) {
        	String text = link.getText();
        	
        	System.out.println(text);
        	
        	if(text!=""||text!=null) {
        		System.out.println(text);
        		
        		
        	}
        }

	}

}

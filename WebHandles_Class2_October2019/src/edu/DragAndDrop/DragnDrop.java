package edu.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(); 
        driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
        
        //Action class for drag and drop
        
        Actions actions_obj = new Actions(driver);
        
        WebElement b1 = driver.findElement(By.xpath("//*[@id=\"block-1\"]/h1"));
        
        WebElement b3 = driver.findElement(By.xpath("//*[@id=\"block-3\"]/h1"));
        
        Thread.sleep(5000);
        //drag and drop operation
        actions_obj.dragAndDrop(b1, b3).perform();
        
        
        

	}

}

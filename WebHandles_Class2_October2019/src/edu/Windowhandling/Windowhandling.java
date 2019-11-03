package edu.Windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();
        
        //launch website
        driver.navigate().to("http://demo.automationtesting.in/Windows.html");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        System.out.println("Title of main window is: " +driver.getTitle());
        
        WebElement tabbedWindow = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
        tabbedWindow.click();
        
        //getWindow methods
       Set<String> windowId =  driver.getWindowHandles();
       
       Iterator<String> iter = windowId.iterator();
       
       String mainWindow = iter.next();
       
       System.out.println(mainWindow);
       
       String childWindow = iter.next();
       System.out.println(childWindow);
       
       //print title of main window
       System.out.println("Title of main window is:" +driver.getTitle());
       
       driver.get("https://www.google.com/");
       
      driver.switchTo().window(childWindow);
      
      System.out.println("Title of child window is:" +driver.getTitle());
      
      driver.get("https://www.facebook.com/");
      //driver.close();
      Thread.sleep(5000);
      
      driver.switchTo().window(mainWindow);
      System.out.println("Title of main window is:" +driver.getTitle());
      
      driver.get("https://www.edureka.co/");
      
      
     
      

	}

}

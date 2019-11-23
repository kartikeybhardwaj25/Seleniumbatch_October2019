package edu.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookScreenShot {
  @Test
  public void captureScreenShot() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath("//input[@id='email']"));
	  
	  //class for taking screenshot
	  
	  TakesScreenshot ts = ((TakesScreenshot)driver);
	  
	  //file path where screenshot needs to be saved
	  
	  File Source = ts.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(Source, new File("./CaptureScreenShot_October2019/ScreenShot/facebook.png"));
	  
	  System.out.println("ScreenShot");
	  
	  driver.quit();
  }
}

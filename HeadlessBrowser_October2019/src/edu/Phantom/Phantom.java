package edu.Phantom;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phantom {

	public static void main(String[] args) {
		
		//ghost driver
		File file = new File("C:\\Selenium_Jars\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("edureka");
		element.submit();
		
		System.out.println("Page title is: "+driver.getTitle());
		driver.quit();

	}

}

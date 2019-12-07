package edu.HTMLunit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("edureka");
		element.submit();
		
		System.out.println("Page title is: "+driver.getTitle());
		
		

	}

}

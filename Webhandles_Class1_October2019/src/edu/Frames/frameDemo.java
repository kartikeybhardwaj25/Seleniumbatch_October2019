package edu.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		//number of iframes in a webpage
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		for(int i=0;i<=10;i++) {
		//switch command to handle frame
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		
		driver.switchTo().frame(i);
		
		
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Edureka");
		
		//switch back to main webpage
		driver.switchTo().parentFrame();
		
		}	

	}

}

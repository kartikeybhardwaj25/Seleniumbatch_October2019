package edu.MousenKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-in");
		
		driver.manage().window().maximize();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"l1_0\"]"));
		
		Actions actions_Obj = new Actions(driver);
		actions_Obj.moveToElement(menu).perform();
		
		Thread.sleep(5000);
		
		WebElement laptop = driver.findElement(By.xpath("//*[@id=\"l2_0\"]/span"));
		actions_Obj.moveToElement(laptop).perform();
		Thread.sleep(5000);
		laptop.click();
		
		WebElement selectlaptop = driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[1]/ul/li[1]/a/img"));
		Thread.sleep(5000);
		selectlaptop.click();
		
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}

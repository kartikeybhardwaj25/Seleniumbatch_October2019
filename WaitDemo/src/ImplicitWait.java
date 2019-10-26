import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		//click button start timer
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
		
		 boolean status = element.isDisplayed();
		  
		 if(status) { System.out.println("Element is displayed"); } else {
		 System.out.println("Element is not displayed"); }
		
		
		
		/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //search for
		 * webdriver text WebElement element =
		 * driver.findElement(By.xpath("//p[@id='demo']"));
		 * 
		 * boolean status = element.isDisplayed();
		 * 
		 * if(status) { System.out.println("Element is displayed"); } else {
		 * System.out.println("Element is not displayed"); }
		 */

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestcase {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");

	//instantiate object
	WebDriver driver = new ChromeDriver();
	
	String expectedTitle = "Welcome: Mercury ours";
	String actualTitle ="";
	
	driver.get("http://www.newtours.demoaut.com/");
	actualTitle =driver.getTitle();
	
	if (actualTitle.contentEquals(expectedTitle)) {
		System.out.println("Test case passed");
	}
	else {
		System.out.println("Test case failed");
	}
	
	}

}

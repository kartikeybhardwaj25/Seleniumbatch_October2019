import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestcase {

	public static void main(String[] args) {
		
	//chrome driver path	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");

	//instantiate object
	WebDriver driver = new ChromeDriver();
	
	//
	String expectedTitle = "Welcome: Mercury ours";
	String actualTitle ="";
	
	//it will fetch title for webpage
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	
	actualTitle =driver.getTitle();
	
	//Comparing actual vs expected 
	if (actualTitle.contentEquals(expectedTitle)) {
		System.out.println("Test case passed");
	}
	else {
		System.out.println("Test case failed");
	}
	
	}

}

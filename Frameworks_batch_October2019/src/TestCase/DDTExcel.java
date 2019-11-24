package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadExcelFile;

public class DDTExcel {
	
	ChromeDriver driver;
	
  @Test(dataProvider="testdata")
  public void DemoProject(String username,String password) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("http://www.newtours.demoaut.com/");
	  
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  
	  driver.findElement(By.name("login")).click();
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Login Successful");
  }
  
  @AfterMethod
  void TearDown() {
	  driver.quit();
  }
  
  @DataProvider(name="testdata")
  
  public Object[][] TestDataFeed() throws IOException{
	  ReadExcelFile config = new ReadExcelFile("F:\\TestData.xlsx");
	  
	  int rows = config.getRowCount(0);
	  
	  System.out.println(rows);
	  
	  Object[][] credentials = new  Object[rows][2];
	  
	  for(int i=0;i<rows;i++) {
		  
		  //getting username data
		  credentials[i][0]=config.getData(0, i, 0);
		  
		//getting username data
		  credentials[i][1]= config.getData(0, i, 1);
		  
	  }
	  
	  return credentials;
	  
  }
}

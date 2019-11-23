package edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	
	
	By login = By.name("login");
	
	//Constructor for memory management
	public LoginElements(WebDriver driver1) {
		this.driver = driver1;
	}
	
	//method for username
	public void userle(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	//method for password
		public void passele(String upwd) {
			driver.findElement(password).sendKeys(upwd);
		}
		
		//method for password
				public void loginele() {
					driver.findElement(login).click();
				}
	

}

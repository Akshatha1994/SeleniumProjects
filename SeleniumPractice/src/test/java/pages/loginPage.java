package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage
{
	
	private WebDriver driver;
	
	loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//add all locators of the page
	private By loginTxt = By.id("user-name");
	private By passwordTxt = By.id("password");
	private By clickTxt = By.name("login-button");
	
	//create functions for the actions made on that page
	public itemsPage performLogin(String username, String password)
	{
		driver.findElement(loginTxt).sendKeys(username);
		driver.findElement(passwordTxt).sendKeys(password);
		driver.findElement(clickTxt).click();
		return new itemsPage(driver);
	}
	

}

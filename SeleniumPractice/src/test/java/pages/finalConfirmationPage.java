package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finalConfirmationPage 
{
	private WebDriver driver;
	public finalConfirmationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By finishBtn = By.id("finish");
	
	public logoutPage clickFinish()
	{
		driver.findElement(finishBtn).click();
		return new logoutPage(driver);
	}

}

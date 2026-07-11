package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customerDetailsPage 
{
	private WebDriver driver;
	public customerDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By postalCode = By.id("postal-code");
	private By clickContinue = By.id("continue");
	
	public finalConfirmationPage enterDetails(String fName, String lName, String code)
	{
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(postalCode).sendKeys(code);
		driver.findElement(clickContinue).click();
		return new finalConfirmationPage(driver);
		
	}

}

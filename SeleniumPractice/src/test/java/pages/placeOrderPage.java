package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class placeOrderPage 
{
	private WebDriver driver;
	public placeOrderPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By checkout = By.id("checkout");
	public customerDetailsPage placeOrder()
	{
		driver.findElement(checkout).click();
		return new customerDetailsPage(driver);
	}

}

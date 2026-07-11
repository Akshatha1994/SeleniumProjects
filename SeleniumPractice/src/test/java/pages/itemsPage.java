package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class itemsPage
{
	private WebDriver driver;
	
	public itemsPage(WebDriver driver)
	{	
		this.driver = driver;
	}
	
	private By item1 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	private By item2 = By.id("add-to-cart-sauce-labs-bike-light");
	private By cartLink = By.xpath("//a[@class='shopping_cart_link']");
	
	public placeOrderPage addToCart()
	{
		driver.findElement(item1).click();
		driver.findElement(item2).click();
		driver.findElement(cartLink).click();
		return new placeOrderPage(driver);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class basePage
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
	    WebDriver  driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	  
	  loginPage loginPage = new loginPage(driver);
	   itemsPage itemsPage = loginPage.performLogin("standard_user", "secret_sauce");
	   placeOrderPage placeOrderPage = itemsPage.addToCart();
	   customerDetailsPage customerDetailsPage = placeOrderPage.placeOrder();
	   finalConfirmationPage finalConfirmationPage = customerDetailsPage.enterDetails("Akshatha", "SM", "560085");
	   logoutPage logoutPage = finalConfirmationPage.clickFinish();
	   logoutPage.logoutBtn();	  
	}

}

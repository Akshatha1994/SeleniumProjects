package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EndToEndAutomationTestingInTheSameClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
	  WebDriver  driver = new ChromeDriver(options);
		
		/*
		 * End-to-end scenario: 
		 * Login 
		 * Sort products
		 *  Add products to cart 
		 *  View cart
		 * Checkout 
		 * Fill customer details 
		 * Complete order 
		 * Verify confirmation 
		 * Logout
		 */
		initialSetup(driver, "https://www.saucedemo.com/");
		loginScreen(driver, By.id("user-name"), By.id("password"), By.name("login-button"));
		dropdownScreen(driver, By.xpath("//select[@class='product_sort_container']"));
		addToCartScreen(driver, "add-to-cart-sauce-labs-bolt-t-shirt", "add-to-cart-sauce-labs-bike-light", "//a[@class='shopping_cart_link']");
		checkout(driver);
		verifyConfirmation(driver);
		logoutValidation(driver);

	}
	
	public static void initialSetup(WebDriver driver, String url)
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	public static void loginScreen(WebDriver driver, By namelocator, By passwordlocator, By loginButton)
	{
		driver.findElement(namelocator).sendKeys("standard_user");
		driver.findElement(passwordlocator).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();
	}
	
	public static void dropdownScreen(WebDriver driver, By locator)
	{
		Select optionsList = new Select(driver.findElement(locator));
		optionsList.selectByVisibleText("Price (low to high)");
	}
	
	public static void addToCartScreen(WebDriver driver, String item1, String item2, String cartclick)
	{
		//Adding to cart
		driver.findElement(By.id(item1)).click();
		driver.findElement(By.id(item2)).click();
		driver.findElement(By.xpath(cartclick)).click();
	}
	
	public static void checkout(WebDriver driver) throws InterruptedException
	{
		//checkout
				driver.findElement(By.id("checkout")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("first-name")).sendKeys("Akshatha");
				driver.findElement(By.id("last-name")).sendKeys("SM");
				driver.findElement(By.id("postal-code")).sendKeys("560085");
				driver.findElement(By.id("continue")).click();
	}
	
	public static void verifyConfirmation(WebDriver driver) throws InterruptedException
	{
		//verify confirmation
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
	public static void logoutValidation(WebDriver driver)
	{
		boolean result = driver.findElement(By.id("login-button")).isDisplayed();
	    if(result == true)
	    {
		   System.out.println("Logout is successful");
	    }
	}

}

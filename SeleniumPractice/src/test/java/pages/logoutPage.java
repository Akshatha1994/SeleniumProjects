package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutPage 
{
	private WebDriver driver;
	public logoutPage(WebDriver driver)
	{
		this.driver = driver;
	}

	private By click3Lines = By.id("react-burger-menu-btn");
	private By clickLogout = By.id("logout_sidebar_link");
	
	public void logoutBtn() throws InterruptedException
	{
		driver.findElement(click3Lines).click();
		Thread.sleep(3000);
		driver.findElement(clickLogout).click();
	}
}

package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseCartPage 
{
	private WebDriver driver;
	public automationExerciseCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By checkoutBtn = By.xpath("//a[text()='Proceed To Checkout']");
	
	public automationExerciseCheckoutPage checkoutBtn()
	{
		driver.findElement(checkoutBtn).click();
		return new automationExerciseCheckoutPage(driver);
		
	}

}

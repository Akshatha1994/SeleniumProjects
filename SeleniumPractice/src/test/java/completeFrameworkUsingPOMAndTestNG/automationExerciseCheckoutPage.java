package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseCheckoutPage 
{
	private WebDriver driver;
	public automationExerciseCheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By placeOrderBtn = By.xpath("//a[text() = 'Place Order']");
	
	public automationExercisePaymentDetailsPage placeOrder()
	{
		driver.findElement(placeOrderBtn).click();
		return new automationExercisePaymentDetailsPage(driver);
	}

}

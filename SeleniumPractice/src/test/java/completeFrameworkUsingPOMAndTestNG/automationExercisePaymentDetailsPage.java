package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExercisePaymentDetailsPage 
{
	private WebDriver driver;
	public automationExercisePaymentDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By nameOnCard = By.name("name_on_card");
	private By cardNumber = By.name("card_number");
	private By cvc = By.name("cvc");
	private By expiryMonth = By.name("expiry_month");
	private By expiryYear = By.name("expiry_year");
	private By payAndConfirmOrder = By.id("submit");
	
	public automationExerciseOrderPlacedPage cardDetails(String name, String cardnumber, String cvcCode, String month, String year ) throws InterruptedException
	{
		driver.findElement(nameOnCard).sendKeys(name);
		driver.findElement(cardNumber).sendKeys(cardnumber);
		driver.findElement(cvc).sendKeys(cvcCode);
		driver.findElement(expiryMonth).sendKeys(month);
		driver.findElement(expiryYear).sendKeys(year);
		driver.findElement(payAndConfirmOrder).click();
		Thread.sleep(5000);
		return new automationExerciseOrderPlacedPage(driver);
	}

}

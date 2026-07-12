package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseAccountDeletedPage 
{
	private WebDriver driver;
	public automationExerciseAccountDeletedPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By deleteAccountValidation = By.xpath("//b[text()='Account Deleted!']");
	private By continueButton = By.xpath("//a[text()='Continue']");
	
	public void accountDeleted()
	{
		if(driver.findElement(deleteAccountValidation).isDisplayed())
		{
			System.out.println("Account is deleted");
		}
		driver.findElement(continueButton).click();
	}

}

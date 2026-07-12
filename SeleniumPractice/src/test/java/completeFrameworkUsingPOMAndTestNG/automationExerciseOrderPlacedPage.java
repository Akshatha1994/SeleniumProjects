package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseOrderPlacedPage 
{
	private WebDriver driver;
	public automationExerciseOrderPlacedPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By continueBtn = By.xpath("//a[text()='Continue']");
	
	public automationExerciseDeleteAccountPage clickContinue()
	{
		driver.findElement(continueBtn).click();
		return new automationExerciseDeleteAccountPage(driver);
	}
}

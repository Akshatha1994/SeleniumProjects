package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseAccounCreatedPage 
{
	private WebDriver driver;
	public automationExerciseAccounCreatedPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By continueBtn = By.xpath("//a[text() = 'Continue']");
	
	public automationExerciseProductsPage continueBtnClick()
	{
		driver.findElement(continueBtn).click();
		return new automationExerciseProductsPage(driver);
	}

}

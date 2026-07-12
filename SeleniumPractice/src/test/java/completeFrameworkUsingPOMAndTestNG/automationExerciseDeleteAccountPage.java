package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseDeleteAccountPage 
{
	private WebDriver driver;
	public automationExerciseDeleteAccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By deleteAccountlnk = By.xpath("(//a[@href='/logout']/parent::li/following-sibling::li)[1]/a");
	
	public automationExerciseAccountDeletedPage deleteAccounLnk()
	{
		driver.findElement(deleteAccountlnk).click();
		return new automationExerciseAccountDeletedPage(driver);
	}

}

package completeFrameworkUsingPOMAndTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationExerciseHomepage 
{
	private WebDriver driver;
	public automationExerciseHomepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginOrSignuplnk;
	
	public loginOrSignUppage loginOrSignUpClick() throws InterruptedException
	{
		Thread.sleep(3000);
		loginOrSignuplnk.click();
		return new loginOrSignUppage(driver);
	}

}

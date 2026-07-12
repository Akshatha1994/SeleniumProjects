package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginOrSignUppage 
{
	private WebDriver driver;
	public loginOrSignUppage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//private By nameTxt = By.name("name");
	@FindBy(name = "name")
	private WebElement nameTxt;
	
	
	private By emailTxt = By.xpath("//input[@data-qa='signup-email']");
	private By signupBtn = By.xpath("//button[text() = 'Signup']");
	
	public automationExerciseSignUpPage signupBtnClick(String name, String email) throws InterruptedException
	{
		nameTxt.sendKeys(name);
		
		driver.findElement(emailTxt).sendKeys(email);
		driver.findElement(signupBtn).click();
		return new automationExerciseSignUpPage(driver);
	}

}

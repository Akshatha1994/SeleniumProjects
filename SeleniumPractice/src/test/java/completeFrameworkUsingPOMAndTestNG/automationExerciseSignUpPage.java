package completeFrameworkUsingPOMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automationExerciseSignUpPage
{
	private WebDriver driver;
	public automationExerciseSignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By titleMrsRadioBtn = By.xpath("//input[@id = 'id_gender2']");
	private By passwordTxt = By.id("password");
	private By firstNameTxt = By.id("first_name");
	private By lastNameTxt = By.id("last_name");
	private By companyTxt = By.id("company");
	private By address1Txt = By.id("address1");
	private By address2Txt = By.id("address2");
	private By stateTxt = By.id("state");
	private By cityTxt = By.id("city");
	private By postalCodeTxt = By.id("zipcode");
	private By mobileNumberTxt = By.id("mobile_number");
	private By createAccountBtn = By.xpath("//button[text() = 'Create Account']");
	
	public automationExerciseAccounCreatedPage enterDetails(String password, String firstName, String lastName, String companyName, String adress1, String adress2, String stateName, String cityName, String postalCode, String mobileNumber)
	{
		driver.findElement(titleMrsRadioBtn).click();
		driver.findElement(passwordTxt).sendKeys(password);
		driver.findElement(firstNameTxt).sendKeys(firstName);
		driver.findElement(lastNameTxt).sendKeys(lastName);
		driver.findElement(companyTxt).sendKeys(companyName);
		driver.findElement(address1Txt).sendKeys(adress1);
		driver.findElement(address2Txt).sendKeys(adress2);
		driver.findElement(stateTxt).sendKeys(stateName);
		driver.findElement(cityTxt).sendKeys(cityName);
		driver.findElement(postalCodeTxt).sendKeys(postalCode);
		driver.findElement(mobileNumberTxt).sendKeys(mobileNumber);
		driver.findElement(createAccountBtn).click();
		return new automationExerciseAccounCreatedPage(driver);
	}
	

}

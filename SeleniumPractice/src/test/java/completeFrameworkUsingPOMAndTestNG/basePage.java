package completeFrameworkUsingPOMAndTestNG;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basePage 
{
	private WebDriver driver;
	
@BeforeMethod
public void setup()
{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");	
		driver = new ChromeDriver(options);
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void Test() throws InterruptedException
{
		automationExerciseHomepage automationExerciseHomepage = new automationExerciseHomepage(driver);
		loginOrSignUppage loginOrSignUppage = automationExerciseHomepage.loginOrSignUpClick();
		automationExerciseSignUpPage automationExerciseSignUpPage = loginOrSignUppage.signupBtnClick("Akshatha Dalve", "akshatha92016@gmail.com");
		automationExerciseAccounCreatedPage automationExerciseAccounCreatedPage = automationExerciseSignUpPage.enterDetails("SaiNilaya!1994", "Akshatha", "Dalve", "Accenture", "50", "Ittmadu", "Karnataka", "Bangalore", "560085", "8951403705");
		automationExerciseProductsPage automationExerciseProductsPage = automationExerciseAccounCreatedPage.continueBtnClick();
		automationExerciseCartPage automationExerciseCartPage = automationExerciseProductsPage.item1();
		automationExerciseCheckoutPage automationExerciseCheckoutPage = automationExerciseCartPage.checkoutBtn();
		automationExercisePaymentDetailsPage automationExercisePaymentDetailsPage = automationExerciseCheckoutPage.placeOrder();
		automationExerciseOrderPlacedPage automationExerciseOrderPlacedPage = automationExercisePaymentDetailsPage.cardDetails("Akshatha S M", "123445677890", "978", "12", "2022");
		automationExerciseDeleteAccountPage automationExerciseDeleteAccountPage = automationExerciseOrderPlacedPage.clickContinue();
		automationExerciseAccountDeletedPage automationExerciseAccountDeletedPage = automationExerciseDeleteAccountPage.deleteAccounLnk();
		automationExerciseAccountDeletedPage.accountDeleted();
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
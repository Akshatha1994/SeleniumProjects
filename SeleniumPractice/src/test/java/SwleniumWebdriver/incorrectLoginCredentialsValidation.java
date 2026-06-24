package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class incorrectLoginCredentialsValidation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.id("username")).sendKeys("Akshatha");
		driver.findElement(By.id("password")).sendKeys("SaiNilaya!2025");
		driver.findElement(By.id("login")).click();	
		Thread.sleep(5000);
		Boolean error = driver.findElement(By.xpath("//div[@class = 'auth_error']/b[text() = 'Invalid Login details or Your Password might have expired. ']")).isDisplayed();
		if(error.equals(true))
		{
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is displayed");
		}
		driver.close();

	}

}

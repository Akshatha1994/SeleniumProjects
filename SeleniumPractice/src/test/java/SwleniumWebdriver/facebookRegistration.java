package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text() = 'Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text() = 'First name']/preceding-sibling::input")).sendKeys("Akshatha");
		driver.findElement(By.xpath("//label[text() = 'Surname']/preceding-sibling::input")).sendKeys("SM");
		driver.findElement(By.xpath("//label[text() = 'Mobile number or email address']/preceding-sibling::input")).sendKeys("8951403705");
		driver.findElement(By.xpath("//label[text() = 'Password']/preceding-sibling::input")).sendKeys("SaiNilaya!2025");
		driver.close();
	}
}

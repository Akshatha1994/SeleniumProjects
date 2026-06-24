package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getTitle 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.id("username")).sendKeys("AkshathaDalve");
		driver.findElement(By.id("password")).sendKeys("SaiNilaya!2025");
		driver.findElement(By.id("login")).click();
		String text = driver.findElement(By.xpath("//td[@class = 'welcome_menu']")).getText();
		System.out.println(text);
		if(text.equals("Welcome to Adactin Group of Hotels"))
		{
			System.out.println("Same webpage is opened");
		}
		else
		{
			System.out.println("Different webpage is opened");
		}
	}

}

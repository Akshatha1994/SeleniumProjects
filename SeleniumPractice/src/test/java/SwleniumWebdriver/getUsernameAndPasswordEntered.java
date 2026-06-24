package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getUsernameAndPasswordEntered 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.id("username")).sendKeys("AkshathaDalve");
		driver.findElement(By.id("password")).sendKeys("SaiNilaya!2025");
		String s = driver.findElement(By.id("username")).getAttribute("value");
		String s1 = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println("Username is: " + s);
		System.out.println("password is: " + s1);
		
		driver.quit();
	}

}

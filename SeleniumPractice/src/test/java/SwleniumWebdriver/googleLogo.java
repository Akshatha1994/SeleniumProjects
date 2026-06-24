package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLogo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Boolean logo = driver.findElement(By.xpath("//*[name() = 'img' and @class = 'lnXdpd']")).isDisplayed();
		if(logo.equals(true))
		{
			System.out.println("Logo is available");
		}
		else
		{
			System.out.println("Logo is not available");
		}
		
		driver.close();
	}

}

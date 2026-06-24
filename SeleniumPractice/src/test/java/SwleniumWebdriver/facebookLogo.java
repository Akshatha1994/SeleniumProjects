package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Boolean logo = driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 24 24']")).isDisplayed();
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
	

////div[@id = 'mount_0_0_bz']/div/div/div/div/div/div[@class = 'x78zum5 xdt5ytf x1n2onr6 xat3117 xxzkxad']/div/div/div/div/div/div/div/svg
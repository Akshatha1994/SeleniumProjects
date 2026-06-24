package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailTitle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label = 'Gmail ']")).click();
		String text = driver.findElement(By.xpath("//a[@aria-label = 'Open the Google Gmail page']/span")).getText();
		if(text.equals("Gmail"))
		{
			System.out.println("Title is Gmail");
		}
		else
		{
			System.out.println("Title is not Gmail");
		}
		driver.close();

	}

}

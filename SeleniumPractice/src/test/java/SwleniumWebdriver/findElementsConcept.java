package SwleniumWebdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsConcept 
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> l = driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for (int i = 1 ; i<=l.size() ; i++)
		{
			System.out.println(l.get(i).getAttribute("href"));
		}
		driver.close();

	}

}
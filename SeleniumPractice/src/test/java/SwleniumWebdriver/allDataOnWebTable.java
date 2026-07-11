package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allDataOnWebTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables?utm_source=chatgpt.com");
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td"));
		System.out.println(list);
		
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}
		
		driver.close();
	}

}

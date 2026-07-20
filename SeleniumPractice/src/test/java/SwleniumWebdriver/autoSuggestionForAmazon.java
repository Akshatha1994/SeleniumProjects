package SwleniumWebdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionForAmazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		
		driver.findElement(By.xpath("//input[@role = 'searchbox']")).sendKeys("iPhone");
		Thread.sleep(3000);
		List<WebElement> lists = driver.findElements(By.xpath("//div[@role = 'row']"));
		System.out.println(lists.size());
		
		for(WebElement list: lists)
		{
			String text = list.findElement(By.xpath(".//div[@role = 'button']")).getAttribute("aria-label");
			System.out.println(text);
		}
		
		for(WebElement list: lists)
		{
			String text = list.findElement(By.xpath(".//div[@role = 'button']")).getAttribute("aria-label");
			if(text.equals("iphone 17 pro screen protector"))
			{
				list.click();
				break;
			}
			//driver.findElement(By.xpath("//div[@role='row']//div[@role = 'button']")).getAttribute("aria-label");
		}
	}

}

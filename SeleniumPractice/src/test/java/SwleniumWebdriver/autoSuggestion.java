package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.xpath("//textarea[@aria-label = 'Search']")).sendKeys("qspiders");
		Thread.sleep(3000);
		List<WebElement> count = driver.findElements(By.xpath("//ul[@role = 'listbox']//li"));
		System.out.println(count.size());
		
		
		for (WebElement list : count)
		{
			String text = list.getAttribute("data-entityname");
			System.out.println(text);
			if (text.equals("QSpiders Hebbal"))
			{
				list.click();
				break;
			}
		}
		/*
		 * for (int i = 0 ; i < count.size() ; i++) {
		 * System.out.println(count.get(i).getAttribute("data-entityname"));
		 * 
		 * } count.get(count.size() - 1).click(); Thread.sleep(3000);
		 */
		//driver.close();
	}


}

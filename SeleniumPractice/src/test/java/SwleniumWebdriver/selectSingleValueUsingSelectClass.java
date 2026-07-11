package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectSingleValueUsingSelectClass 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu?utm_source=chatgpt.com");
			driver.findElement(By.xpath("//div[text() = 'Select Option']/parent::div")).click();
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//div[contains(@id, 'react-select-2-option')]"));
			System.out.println(list.size());
			for (int i = 0 ; i<list.size() ; i++)
			{
				list.get(i).getText();
			}
			
			}
	

}

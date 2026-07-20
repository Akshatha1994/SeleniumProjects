package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTheBlackPhoneInTheList 
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
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		System.out.println(lists.size());
		
		for(WebElement list : lists)
		{
			String devicename = list.findElement(By.xpath(".//h2//span")).getText();
			
			if(devicename.contains("Black"))
			{
				System.out.println("Black iPhone");
				System.out.println(devicename);
				System.out.println("---------------------");
			}
		}
		
		


	}

}

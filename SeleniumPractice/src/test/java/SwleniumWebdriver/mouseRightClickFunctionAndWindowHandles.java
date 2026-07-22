package SwleniumWebdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseRightClickFunctionAndWindowHandles 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("iPhone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type = 'submit']")).click();
		List<WebElement> lists = driver.findElements(By.xpath("//div[@role='listitem']//h2"));
		System.out.println("List of Products are : " + lists.size());
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window is : " + parentWindow);
		
		for (WebElement list : lists) 
		{
			String deviceName = list.findElement(By.xpath("./span")).getText();
			System.out.println("Device name is : " + deviceName);
			if(deviceName.contains("iPhone 16"))
		    {
				String productLink = list.findElement(By.xpath("//div[@role='listitem']//h2/parent::a")).getAttribute("href");
				System.out.println("Product link is : " +productLink);
				((JavascriptExecutor)driver).executeScript("window.open(arguments[0])" , productLink);
				break;		
		    }		
		}
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of windows opened are : " +windows.size());
		for (String window : windows)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				List<WebElement> serviceProviders = driver.findElements(By.xpath("//div[@id='inline-twister-expander-content-service_provider']//li"));
				System.out.println("Number of data providers : " +serviceProviders.size());
				
				for (WebElement serviceProvider : serviceProviders)
				{
					String dataProviderName = serviceProvider.findElement(By.xpath(".//div/span")).getText();
					System.out.println("Data Provider name : " +dataProviderName);
					if(dataProviderName.contains("Cricket"))
					{
						serviceProvider.click();
						break;
					}
				}
				
				driver.switchTo().window(parentWindow);
				driver.findElement(By.xpath("//input[@role='searchbox']")).clear();
				driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Android");
				System.out.println("Switched back to Parent Window");
				driver.quit();
				
			}
		}
		


	}

}

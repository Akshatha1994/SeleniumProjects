package SwleniumWebdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandlesConcept 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " +parentWindow);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Amazon"));
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent Window Title: " +parentWindowTitle);
		
		driver.findElement(By.xpath("//span[@role = 'img']")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of windows opened are : " +windows.size());
		
		for (String window : windows)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				String childWindowTitle = driver.getTitle();
				System.out.println("Child Window Title : " +childWindowTitle);
				break;
			}
		}
		
		
        //perform actions on child window
		driver.findElement(By.className("a-dropdown-prompt")).click();
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@role='listbox']//li"));	
		
		for(WebElement list : lists)
		{
			if(list.getText().contains("IDR"))
			{
				list.click();
				break;
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("CurrentWindowTitle : " + driver.getTitle());
		if(driver.getTitle().equals(parentWindowTitle))
		{
		System.out.println("In the main page now");
		}
		
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("iPhone");


	}

}

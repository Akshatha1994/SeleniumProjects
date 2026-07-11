package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class completeFacebookRegistration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://workspace.google.com/intl/en-US/gmail/");
		driver.findElement(By.xpath("//span[text() = 'Create an account']")).click();
		driver.findElement(By.xpath("//a[@aria-label = 'Gmail - For my personal use']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Akshatha");
		driver.findElement(By.name("lastName")).sendKeys("Dalve");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).click();
		List<WebElement> monthlist = driver.findElements(By.xpath("//ul[@role='listbox' and @aria-label='Month']/li"));
		System.out.println(monthlist.size());
		for (WebElement e : monthlist) 
		{
		    System.out.println(e.getText());
		}
		
		monthlist.get(monthlist.size() - 2).click();
		
		driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
		List<WebElement> genderlist = driver.findElements(By.xpath("//ul[@role='listbox' and @aria-label='Gender']/li"));
		System.out.println(genderlist.size());
		Thread.sleep(3000);
		for (WebElement e : genderlist) 
		{
		    System.out.println(e.getText());
		}
		
		genderlist.get(genderlist.size() - 3).click();
		

	}

}

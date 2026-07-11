package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleDataOnWebTable 
{

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables?utm_source=chatgpt.com");
		String value = driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText();
		System.out.println("Data is: " + value);
	}	

}

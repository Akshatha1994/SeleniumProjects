package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class framesPractice 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/iframe?utm_source=chatgpt.com");
		WebElement frameID = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameID);
		String text = driver.findElement(By.xpath("//body[@id = 'tinymce']/p")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		String parentText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(parentText);
		


	}

}

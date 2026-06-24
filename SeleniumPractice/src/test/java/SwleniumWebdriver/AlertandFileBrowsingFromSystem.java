package SwleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertandFileBrowsingFromSystem 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Alert popup
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.name("proceed")).click();
		//Thread.sleep(3000);
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//ORRRRR
		//driver.switchTo().alert().accept();
		
		//File Browsing from System
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(3000);
		driver.findElement(By.name("fileupload")).sendKeys("/Users/akshathasm/Desktop/Photo.jpg");
		
		//Handle Frames
		driver.get("https://freecrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.name("email")).sendKeys("dalveakshatha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Akku@2015");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])"));
		driver.switchTo().frame("");


	}

}

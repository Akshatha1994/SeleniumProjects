package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumprac {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		
		//String currenturl = driver.getCurrentUrl();
		//System.out.println(currenturl);
		
		
		//if(title.equals(""))
		//{
		//	System.out.println("Correct title");
		//}
		//else
		//{
		//	System.out.println("Incorrect title");
		//}
	
		//1. How to find element by ID:	
		//driver.get("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("selenium tutorial");
		//driver.close();
		
		//2. How to find element by NAME:
		//driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		//driver.close();
		
		//3. How to find element by Xpath:
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium tutorial");
		//Thread.sleep(3000);
		//driver.close();
		
		//4. How to find element by linked text:
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}

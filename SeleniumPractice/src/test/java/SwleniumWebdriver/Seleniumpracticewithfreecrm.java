package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpracticewithfreecrm {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("Akshatha");
		driver.findElement(By.name("password")).sendKeys("MSRNeepa@2030");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		

	}

}

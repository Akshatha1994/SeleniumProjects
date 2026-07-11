package SwleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectingTwoCheckboxesOutOfFour {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Users/akshathasm/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testmuai.com/selenium-playground/checkbox-demo/?utm_source=chatgpt.com");
		Thread.sleep(5000);
		List<WebElement> count = driver.findElements(By.xpath("//div/h2[text() = 'Multiple Checkbox Demo']/parent::div/div/label"));
		//List<WebElement> count = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		System.out.println(count.size());
		
		for (int i = 0 ; i<count.size(); i++)
		{
			if((count.get(i).getText()).equals("Option 1") || (count.get(i).getText()).equals("Option 3"))
			{
				count.get(i).click();
			}

		}
		//driver.close();
	
	}

}






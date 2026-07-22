package SwleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
		
		
		WebElement element = driver.findElement(By.xpath("//h2[text() = 'Mouse Hover']"));
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].scrollIntoView()", element);
		
		WebElement hoverElement = driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement clickLaptops = driver.findElement(By.xpath("//div[@class = 'dropdown-content']"));
		WebElement buttonDoubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		WebElement draggableElement = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement droppableElement = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions a = new Actions(driver);
		
		//Mouse Hover
		a.moveToElement(hoverElement).click(clickLaptops).perform();
		je.executeScript("arguments[0].scrollIntoView()", element);		
		String field2TextBefore = driver.findElement(By.xpath("//input[@id = 'field2']")).getAttribute("value");
		System.out.println("The value present inside Field 2 Before is : " + field2TextBefore);
		
		//Mouse Double click
		a.doubleClick(buttonDoubleClick).perform();
		String field2TextAfter = driver.findElement(By.xpath("//input[@id = 'field2']")).getAttribute("value");
		System.out.println("The value present inside Field 2 After is : " + field2TextAfter);
		
		//Mouse Drag and Drop
		a.dragAndDrop(draggableElement, droppableElement).perform();
		String droppableText = droppableElement.findElement(By.xpath(".//p")).getText();
		if (droppableText.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Mouse drop is successful");
		}
		
		/*
		 * //Mouse Right click WebElement rightClickButton =
		 * driver.findElement(By.xpath("//input[@id = 'field2']"));
		 * a.contextClick(rightClickButton).perform();
		 */
		
		//Mouse Drag and Drop with slider
		WebElement sliderElement = driver.findElement(By.xpath("//h2[text()='Slider']"));
		je.executeScript("arguments[0].scrollIntoView()", sliderElement);	
		WebElement slider= driver.findElement(By.cssSelector("#slider-range span:nth-child(2)"));
		System.out.println("Percentage slider Before is : " +slider.getAttribute("style"));
		//a.dragAndDropBy(slider,500,0).perform();
		a.clickAndHold(slider).moveByOffset(30,0).release().perform();
		System.out.println("Percentage slider After is : " +slider.getAttribute("style"));
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
	}

}

package completeFrameworkUsingPOMAndTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationExerciseProductsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public automationExerciseProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By item1 = By.xpath("//a[@data-product-id='1']");
    private By item2 = By.xpath("//a[@data-product-id='2']");
    private By continueShopping = By.xpath("//button[text()='Continue Shopping']");
    private By viewCart = By.xpath("//u[text()='View Cart']");

    public automationExerciseCartPage item1() 
    {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        List<WebElement> product1 = driver.findElements(item1);

        for (WebElement e : product1) 
        {
            if (e.isDisplayed()) 
            {
                wait.until(ExpectedConditions.visibilityOf(e));
               ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
                break;
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping));
        driver.findElement(continueShopping).click();
        List<WebElement> product2 =
                driver.findElements(item2);
        for (WebElement e : product2) {
            if (e.isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOf(e));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
                break;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(viewCart));
        driver.findElement(viewCart).click();
        return new automationExerciseCartPage(driver);
    }
}

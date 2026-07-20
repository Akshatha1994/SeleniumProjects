package SwleniumWebdriver;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBackgroundColorOfBanner {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(5000);

        // Locate the banner image
        WebElement banner = driver.findElement(
                By.xpath("//a[contains(@href,'infinite-m3-at-store')]//img"));

        // Verify banner is displayed
        System.out.println("Banner displayed : " + banner.isDisplayed());

        // Get image URL
        String imageUrl = banner.getAttribute("src");

        System.out.println("Image URL : " + imageUrl);

        // Download image
        BufferedImage image = ImageIO.read(new URL(imageUrl));

        System.out.println("Width  : " + image.getWidth());
        System.out.println("Height : " + image.getHeight());

        // Find first blue pixel
        boolean found = false;

        for (int y = 0; y < image.getHeight(); y++) {

            for (int x = 0; x < image.getWidth(); x++) {

                Color c = new Color(image.getRGB(x, y));

                if (c.getBlue() > 150 &&
                    c.getBlue() > c.getRed() + 30 &&
                    c.getBlue() > c.getGreen() + 30) {

                    System.out.println("--------------------------------");
                    System.out.println("Blue Pixel Found");
                    System.out.println("X = " + x);
                    System.out.println("Y = " + y);
                    System.out.println("RGB = " + c);

                    String hex = String.format("#%02X%02X%02X",
                            c.getRed(),
                            c.getGreen(),
                            c.getBlue());

                    System.out.println("HEX = " + hex);

                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        driver.quit();
    }
}
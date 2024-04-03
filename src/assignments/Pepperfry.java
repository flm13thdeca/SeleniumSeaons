package assignments;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pepperfry {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.pepperfry.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test() throws IOException, InterruptedException {
        try {
            driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            driver.switchTo().defaultContent();
        }
      
        WebElement block = driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));
        System.out.println(block.getText());
        List<WebElement> allLinks = block.findElements(By.tagName("a"));
        System.out.println("No of Links in Module: " + allLinks.size());

        for (WebElement link : allLinks) {
            System.out.println("Link Text: " + link.getText());
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", link);
            Thread.sleep(2000); 
            System.out.println("Page Title: " + driver.getTitle());
            System.out.println("Page URL: " + driver.getCurrentUrl());           
            block = driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));
            allLinks = block.findElements(By.tagName("a"));
        }
    }

    @AfterMethod
   public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

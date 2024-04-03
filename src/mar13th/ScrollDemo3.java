package mar13th;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDemo3 {
	

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrollTest() throws IOException
	{
		
		try
		{
			// here write code to click the pop-up close button
			
			driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
			
			driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.switchTo().defaultContent();
		}
		
		WebElement element=driver.findElement(By.xpath("//img[contains(@src,'3d3d80ba-51fb-44ff-bc74-b371e1927bf3')]"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}

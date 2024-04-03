package assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PepperfryAssignment {
	WebDriver driver;
	
@BeforeMethod
	
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		}
@Test
public void javapractice() throws InterruptedException {
	
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollBy(0,7000);");
		 String HomeWindowId=driver.getWindowHandle();
		 System.out.println(HomeWindowId);
		 WebElement block=driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));
		List<WebElement>links=driver.findElements(By.xpath("//p[text()='Partner With Us']/parent::div//a"));
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++) {
			js.executeScript("arguments[0].click();",links.get(i));
			Set<String> allWindowIds=driver.getWindowHandles();
			Thread.sleep(3000);
			System.out.println("allwindows"+allWindowIds);
			Set<String> allWinIds = driver.getWindowHandles();
			Iterator<String> it=allWinIds.iterator();
			while(it.hasNext())
			{
				String currentWindow=it.next();
				if(!currentWindow.equals(HomeWindowId))
				{
					driver.switchTo().window(currentWindow);
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					driver.close();
				}
			}
			driver.switchTo().window(HomeWindowId);
		}
		
		/*
		 * Set<String> allWinIds = driver.getWindowHandles(); Iterator<String>
		 * it=allWinIds.iterator();
		 * 
		 * while(it.hasNext()) { Thread.sleep(3000);
		 * driver.switchTo().window(it.next()); System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); }
		 * 
		 * driver.switchTo().window(HomeWindowId);
		 */
			}
}



package apr3rd;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SalesForceLogin {

	@Test
	public void salesForceLoginTest() throws InterruptedException
	{
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("hgf-c360nav[locale='in']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("hgf-c360login[aria-haspopup='true']")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector(" hgf-popover:nth-child(1) > hgf-button:nth-child(1) > span:nth-child(2)")).click();
		shadow1.findElement(By.cssSelector("a[href='https://login.salesforce.com/?locale=in']")).click();
		Thread.sleep(6000);
	}
	
}

package mar7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandling2 {
	

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void frameHandlingTest() throws InterruptedException
	{
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.switchTo().frame("contents");
		
		driver.findElement(By.xpath("//font[contains(text(),'\"I Hate Frames\" Frames Page')]/parent::a")).click();
		
		//important point 
		
		// to switch to next frame or isolate frame , first we need to switch to page
		//defaultContent()
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(6000);
		
		driver.switchTo().frame("main");
		
		// //b[contains(text(),'Here')]/parent::font/parent::a
		//or //b[contains(text(),'Here')]/ancestor::a
		
		driver.findElement(By.xpath("//b[contains(text(),'Here')]/ancestor::a")).click();
		
		Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}

package mar15th;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class CheckBox {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void radioButtonTest() throws IOException, InterruptedException
	{
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
	}
	
	@Test
	public void radioButtonTest2() throws IOException, InterruptedException
	{
		
		//to validate all checkboxes when none is selected 
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/descendant::input[@type='checkbox']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		
		for(int i=0;i<allChecks.size();i++)
		{
			if(allChecks.get(i).isSelected())
			{
				allChecks.get(i).click();
				Thread.sleep(3000);
			}
		}
			
				
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
	}
	
	@Test
	public void radioButtonTest3() throws IOException, InterruptedException
	{
		
		//to validate all checkboxes when all are selected 
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/descendant::input[@type='checkbox']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		
		for(int i=0;i<allChecks.size();i++)
		{
			if(!allChecks.get(i).isSelected())
			{
				allChecks.get(i).click();
				Thread.sleep(3000);
			}
		}
			
				
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

	
}

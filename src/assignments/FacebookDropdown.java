package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		//2nd oct 2000
		
		//driver.findElement(By.name("birthday_day")).sendKeys("2");
		
		//driver.findElement(By.name("birthday_month")).sendKeys("Oct");
		
		//driver.findElement(By.name("birthday_year")).sendKeys("2000");
		
		//WebElement e1=driver.findElement(By.name("birthday_day"));
		
		//Select s1=new Select(e1);
		
		//s1.selectByVisibleText("2");
		
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("2");
		
		/*
		 * WebElement e2=driver.findElement(By.name("birthday_month"));
		 * 
		 * Select s2=new Select(e2);
		 * 
		 * s2.selectByVisibleText("Oct");
		 */
		
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
		
		/*
		 * WebElement e3=driver.findElement(By.name("birthday_year"));
		 * 
		 * Select s3=new Select(e3);
		 * 
		 * s3.selectByVisibleText("2000");
		 */
		
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2000");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}

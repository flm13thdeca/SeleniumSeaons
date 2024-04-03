package feb13th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//close 
		
		//driver.close();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		//Thread.sleep(3000);
		
		//quit()
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		driver.quit();
		
		//driver.close();

	}

}

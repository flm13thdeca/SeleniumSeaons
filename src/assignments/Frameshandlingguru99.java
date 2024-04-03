package assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frameshandlingguru99 {

	WebDriver driver;

	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}

	@Test
	public void framesHandling() throws InterruptedException {
		String homeWindowId = driver.getWindowHandle();
		System.out.println("homeWindowId:" + homeWindowId);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		driver.switchTo().defaultContent();
		Set<String> allWindowsIds = driver.getWindowHandles();
		System.out.println("allWindowsIds :" + allWindowsIds);
		Iterator<String> it = allWindowsIds.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			if (driver.getTitle().equalsIgnoreCase("Selenium Live Project: FREE Real Time Project for Practice")) {
				break;
			}
		}

		Thread.sleep(3000);
		//List<WebElement> coursescount = driver.findElements(By.xpath("//span[@class='kt-blocks-info-box-title']"));
		List<WebElement> coursescount=driver.findElements(By.
				xpath("//p[text()='Top Tutorials']/parent::div/descendant::span[@class='kt-blocks-info-box-title']"));
		System.out.println("total count of links :" + coursescount.size());
		for (int i = 0; i < coursescount.size(); i++) {
			System.out.println(coursescount.get(i).getText());
		}
		Thread.sleep(3000);
	}

	@AfterMethod
	public void close() {

		driver.quit();
	}
}

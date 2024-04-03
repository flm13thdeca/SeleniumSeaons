package feb12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(String):void ==here String is URL of app
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(5000);
		
		//close():void
		
		driver.close();
		
		

	}

}

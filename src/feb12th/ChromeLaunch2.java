package feb12th;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch2 {

	public static void main(String[] args) {
		
		//using Selenium 3.14.159
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\FLM13thDec\\jars\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();

	}

}

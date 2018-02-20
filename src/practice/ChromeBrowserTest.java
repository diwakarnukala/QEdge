package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");

	}

}

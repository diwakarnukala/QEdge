package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLinksInBing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}

}
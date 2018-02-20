package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLinksOnHeader {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		// identify header section
		WebElement header = driver.findElement(By.className("sw_tb"));
		//capturing all links under header by tagname
		List<WebElement> headerLinks = header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
	}

}

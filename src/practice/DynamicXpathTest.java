package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id, 'yui_3_18_0_3_15041')]/span"));
		System.out.println(list.size());
		list.get(2).click();
		
	}

}

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}

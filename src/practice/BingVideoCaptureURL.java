package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingVideoCaptureURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Videos")).click();
		System.out.println(driver.getCurrentUrl());
		
	}

}

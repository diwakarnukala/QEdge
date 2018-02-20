package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/advanced_search");
		driver.findElement(By.id("_dKg")).sendKeys("Diwakar");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
	}

}

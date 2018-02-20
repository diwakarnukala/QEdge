package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		if (driver.findElement(By.id("")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}

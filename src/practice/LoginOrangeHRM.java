package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser_Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

	}

}

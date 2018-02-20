package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminLoginTestNG1 {
	public static ChromeDriver driver;
	@BeforeTest
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void appLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest
	public void appClose()
	{
		driver.close();
	}

}

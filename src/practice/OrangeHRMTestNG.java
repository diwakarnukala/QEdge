package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrangeHRMTestNG {
	// public WebDriver driver = new FirefoxDriver();
	public ChromeDriver driver = new ChromeDriver();

	@BeforeSuite
	public void OpenWebDriver() {
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Selenium\\Browser_Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@BeforeTest

	public void LoginHRM() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterTest

	public void LogoutHRM() {
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterSuite
	public void CloseWebDriver() {
		driver.close();

	}

}

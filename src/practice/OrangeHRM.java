package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(pim).build().perform();
		driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']")).click();
		driver.findElement(By.id("firstName")).sendKeys("TestD");
		driver.findElement(By.id("lastName")).sendKeys("TestD");
		driver.findElement(By.id("btnSave")).click();
	}

}

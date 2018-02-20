package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		driver.findElement(By.className("nav-input")).click();
	}

}

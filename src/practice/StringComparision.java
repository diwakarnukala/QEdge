package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringComparision {

	public static void main(String[] args) {
		String expTitle="Selenium - Yahoo India Search Results";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		driver.findElement(By.id("uh-search-button")).click();
		String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}

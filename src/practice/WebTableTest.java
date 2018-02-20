package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Employee List")).click();
		//rows count
		List<WebElement> rows = driver.findElements(By.xpath(".//[@id='resultTable']/tbody/tr"));
		//System.out.println(rows.size());
		for(int i=0; i < rows.size(); i++)
		{
			//column count
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			System.out.println(col.get(2).getText());
		}
		
	}

}

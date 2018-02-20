package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		
		String homePage = driver.getWindowHandle();
		/*
		System.out.println(homePage);
		driver.findElement(By.id("loginsubmit")).click();
		String currentPage = driver.getWindowHandle();
		System.out.println(currentPage);
		*/
		
		//from above we will get same window ids, in order to do some operations on the second window follow the below code
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while (it.hasNext())
		{
			String currentwindowID=it.next().toString();
			if(!homePage.equals(currentwindowID))
			{
				driver.switchTo().window(currentwindowID);
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}
		
	}

}

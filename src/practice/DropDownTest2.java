package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList = drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i=0; i < dropList.size(); i++)
		{
			System.out.println(dropList.get(i).getText());
		}
	}

}

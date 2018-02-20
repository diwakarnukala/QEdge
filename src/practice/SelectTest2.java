package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		Select slt = new Select(drop);
		List<WebElement> dropList = slt.getOptions();
		System.out.println(dropList.size());
		for(WebElement element:dropList)
		{
			System.out.println(element.getText());
		}
	}

}

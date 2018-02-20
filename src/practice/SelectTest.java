package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		//capturing multiple selected items
		List<WebElement> first = slt.getAllSelectedOptions();
		System.out.println(first.size());
		for (int i=0; i <first.size(); i++)
		{
			System.out.println(first.get(i).getText());
		}
		
		// To check the possibility of selecting multiple items at a time isMultiple
		
		Select slt = new Select(drop);
		slt.selectByIndex(24);
	}

}



package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement> countryList = country.findElements(By.tagName("option"));
		System.out.println(countryList.size());
		for (int i=0; i<countryList.size(); i++)
		{
			countryList.get(i).click();
			if (countryList.get(i).isSelected())
			{
				System.out.println(countryList.get(i).getText()+" : Is Selected");
			}else
			{
				System.out.println(countryList.get(i).getText()+" : Is Not Selected");
			}
		}

	}

}

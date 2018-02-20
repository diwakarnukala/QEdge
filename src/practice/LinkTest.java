package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i=0; i<links.size(); i++)
		{
			//System.out.println(links.get(i).getText());
			
			//if (links.get(i).getText().isEmpty())

			//click on a particular link
			if (links.get(i).getText().equals("Gmail"))
			{
				//System.out.println(links.get(i).getText());
				links.get(i).click();
			}
		}
	}

}
package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathTest2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in/");
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		Thread.sleep(2000);
		List<WebElement> city = driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(city.size());
		for(int i=0; i < city.size(); i++)
		{
			//System.out.println(city.get(i).getText());
			if(city.get(i).getText().equals("Hyderabad"))
			{
				city.get(i).click();
				break;
			}
		}
		
	}

}

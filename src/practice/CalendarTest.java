package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarTest {

	public static void main(String[] args) throws Exception {
		String date = "25/june/2018";
		String[] dateSplit=date.split("/");
		String day=dateSplit[0];
		String month=dateSplit[1];
		String year=dateSplit[2];
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		//click on date
		driver.findElement(By.id("DepartDate")).click();
		//selecting calyear
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		//select calDay
		//rows count
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		for (int i=0; i <rows.size(); i++)
		{
			//column count
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<col.size(); j++)
			{
				String claDay=col.get(j).getText();
				if(claDay.equals(day))
				{
					col.get(i).click();
					break;
				}
			}
		}
	}

}

package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i <links.size(); i++)
		{
			String linkName = links.get(i).getText();
			links.get(i).click();
			TakesScreenshot sc=(TakesScreenshot)driver;
			File src= sc.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("D:\\" +linkName+".png"));
			driver.navigate().back();
			links = driver.findElements(By.tagName("a"));
			
			
			
			
		}
	}

}

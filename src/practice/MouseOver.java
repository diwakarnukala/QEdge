package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		WebElement pdf=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/l"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(pdf).build().perform();
	}

}

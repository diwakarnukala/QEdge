package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		WebElement reg =driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/l"));
		WebElement asm = driver.findElement(By.xpath(".//*[@id=myjquerymenu']/ul/"));
		WebElement kys = driver.findElement(By.xpath(""));
		
		Actions chain = new Actions(driver);
		chain.moveToElement(reg).moveToElement(asm).pause(2000).moveToElement(kys).click().build().perform();
	}

}

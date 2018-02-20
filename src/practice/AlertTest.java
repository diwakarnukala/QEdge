package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept(); //ok
		//alt.dismiss();// //close
	}

}

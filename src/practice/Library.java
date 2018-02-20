package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	public static FirefoxDriver driver;
	public static String res;

	public static void main(String[] args) {
		Library app = new Library();
		String results = app.appLaunch("");
		System.out.println(results);
	}

	// appLaunch
	public String appLaunch(String url) {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) {
			res = "Pass";
		} else {
			res = "Fail";
		}
		return res;
	}

}

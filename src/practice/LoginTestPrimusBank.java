package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestPrimusBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser_Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		
	}

}

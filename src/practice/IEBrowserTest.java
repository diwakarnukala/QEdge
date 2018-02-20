package practice;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Browser_Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}

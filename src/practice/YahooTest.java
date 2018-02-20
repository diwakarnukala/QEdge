package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-search.box"))

	}

}

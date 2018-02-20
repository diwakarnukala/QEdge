package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHRMAddEmpTestNG extends OrangeHRMTestNG {

	@Test
	public void addEmp() {
		WebElement pim =driver.findElement(By.xpath("//*[@id=\\'menu_pim_viewPimModule']/b"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(pim).build().perform();
		driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']")).click();
		driver.findElement(By.id("firstName")).sendKeys("TestD");
		driver.findElement(By.id("lastName")).sendKeys("TestD");
		driver.findElement(By.id("btnSave")).click();
	}

}

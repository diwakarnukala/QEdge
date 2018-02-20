package practice;

import org.testng.annotations.Test;

public class MultipleTest {
	@Test()
		public void appLaunch()
		{
			System.out.println("AppLaunch");
		}
	
@Test(dependsOnMethods = "appLaunch")
public void appLogin()
{
	System.out.println("AppLogin");
}
}

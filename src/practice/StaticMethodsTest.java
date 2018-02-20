package practice;

public class StaticMethodsTest {

	public static void main(String[] args) {

		//calling static method without return value
		appLaunch();
		//calling static method with return value
		appLogin();
		
	}
	public static void appLaunch() {
		System.out.println("Static method without return value");
	}
	public static String appLogin() {
		System.out.println("Static method with return value");
		return "Pass";
	}
}

package practice;

public class MethodsParameterizationTest {

	public static void main(String[] args) {
//call by value
		//appLogin("Diwakar", "Selenium");
//call by reference
		String userName="QEdge";
		String password="QTP";
		appLogin(userName, password);
		
	}
	public static void appLogin(String username, String password) {
		System.out.println("Username :" +username);
		System.out.println("Password :" +password);
	}

}

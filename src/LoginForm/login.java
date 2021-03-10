package LoginForm;
import UserDao.*;
public class login {
	private static String Name;
	private static String userPasswad;
public static void main(String args[]) {
		user dao = new user();
		dao.findUser(Name, userPasswad);
		System.out.printf("finderuser");
	}

	public static void init() {
		
	}
	public static void display() {
		
	}

	public static void validate() {
		
	}
	
}

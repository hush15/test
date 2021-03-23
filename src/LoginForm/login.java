package LoginForm;
import UserDao.*;
public class login {
	private static String Name ;
	private static String userPasswad;
	public static void init() {
		user dao = new user();
		dao.findUser(Name, userPasswad);
		System.out.printf("finderuser");
	}
	public static void display() {
		/*Button button ;
		AbstractButtonType buttons;
		buttons =(AbstractButtonType)XMLButton.getButton();
		button = buttons.getButton();
		button.display();
*/
		XMLButton button = new XMLButton();
		button.getButton();
		
	//	CircleButton button = new CircleButton() ;
	//	button.Button();
	}
	public static void validate() {		
	}
	
}
  

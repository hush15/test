package LoginForm;

public abstract class AbstractButton {
	public  void Button() {
	}
}
 class  CircleButton extends AbstractButton {
	public  void Button() {		
		System.out.println("这是一个圆按钮");
	}
	
}
class rectangleButton extends AbstractButton {	
	public void Button() {
		System.out.println("这是一个方按钮");
		
	}
}
	
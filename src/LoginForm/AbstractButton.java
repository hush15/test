package LoginForm;

public abstract class AbstractButton {
	public  void Button() {
	}
}
 class  CircleButton extends AbstractButton {
	public  void Button() {		
		System.out.println("����һ��Բ��ť");
	}
	
}
class rectangleButton extends AbstractButton {	
	public void Button() {
		System.out.println("����һ������ť");
		
	}
}
	
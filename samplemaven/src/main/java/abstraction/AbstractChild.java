package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		AbstractChild obj= new AbstractChild();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
	int a= 30;
	int b= 40;
	int c= a+b;
	System.out.println(c);
		
	}

	@Override
	public void show() {
		System.out.println("This is abstract child");
		
	}

}

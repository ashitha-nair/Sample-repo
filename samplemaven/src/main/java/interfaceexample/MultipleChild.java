package interfaceexample;

public class MultipleChild implements MultipleParent1, MultipleParent2 {

	public static void main(String[] args) {
		MultipleChild obj= new MultipleChild();
		obj.display();
		obj.show();

	}

	@Override
	public void show() {
		System.out.println("This is parent 1");
		
	}

	@Override
	public void display() {
	System.out.println("This is parent 2");
		
	}

}

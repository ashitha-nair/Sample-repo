package inheritance;

public class MultilevelChild extends MultilevelParent {
	
	public void print()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		MultilevelChild obj= new MultilevelChild();
		obj.print();
		obj.show();
		obj.display();

	}

}

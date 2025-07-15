package polymorphism;

public class PolyChild extends PolyParent{
	
	public void display (int a, int b)
	{
	int c= a-b;
	System.out.println(c);
	super.display(9, 8);
	}

	public static void main(String[] args) {
	
		PolyChild obj= new PolyChild();
				obj.display(8, 7);
	}

}

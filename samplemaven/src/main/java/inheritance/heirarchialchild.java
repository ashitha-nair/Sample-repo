package inheritance;

public class heirarchialchild extends heirarchialparent {

	public void print()
	{
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		heirarchialchild obj=new heirarchialchild();
		obj.print();
		obj.display();
	}

}

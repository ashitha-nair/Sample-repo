package inheritance;

public class heirarchialchild2 extends heirarchialparent{
	public void show()
	{
		System.out.println("This is child2");
	}

	public static void main(String[] args) {
		heirarchialchild2 obj=new heirarchialchild2();
		obj.show();
		obj.display();

	}

}

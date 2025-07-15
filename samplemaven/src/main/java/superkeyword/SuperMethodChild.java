package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public void child()
	{
		System.out.println("This is child method");
		super.Parent();
	}
	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.child();
	}

}

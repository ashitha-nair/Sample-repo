package assignments;

public class AdditionChild extends AddtionParent{
	
	public void display()
	{
		super.sum();
	System.out.println("Total-"+ c);

	}

	public static void main(String[] args) {
		AdditionChild obj=new AdditionChild();
		obj.display();
		
	}

}

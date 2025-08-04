package assignments;

public class AdditionChild extends AddtionParent{
	
	public void display()
	{
		super.sum();
	System.out.println("Total-"+ c);

	if(c%10==0)
	{
		System.out.println(c+ " is divisible by 10.");
	}
	else
	{
		System.out.println(c+ " is not divisible by 10.");
	}
	}

	public static void main(String[] args) {
		AdditionChild obj=new AdditionChild();
		obj.display();
		
	}

}

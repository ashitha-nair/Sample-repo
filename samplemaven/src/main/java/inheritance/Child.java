package inheritance;

public class Child extends Singleparent {
	
	public void print()
	
		{
			System.out.println("Child class");
		}
	

	public static void main(String[] args) {
		Child obj=new Child();
		obj.print();
		obj.display();
		

	}

}

package assignments;

public class StudentChild {
	String address;
	StudentParent ref;

	public StudentChild(String address, StudentParent ref)
	{
		this.address=address;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Name: "+ ref.name);
		System.out.println( "Roll No: "+ ref.rollnumber);
		System.out.println("Address: "+ address);
	
	}
	public static void main(String[] args) {
		StudentParent obj=new StudentParent("Lekshmi", 34);
		StudentChild obj1= new StudentChild("Trivandrum", obj);
obj1.display();
	}

}

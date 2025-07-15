
public class Factorial {
	int result;
	
	public void calculation(int a)
	{
		for(int i=1;i<=4;i++)
	{
	result=a*i;
	a=result;
	}
		this.display();
	}
	public void display()
	{
	System.out.print("Factorial of 4 is " + result);
	}
	public static void main(String args[])
	{
	Factorial obj=new Factorial();
	obj.calculation(1);
	}
	}
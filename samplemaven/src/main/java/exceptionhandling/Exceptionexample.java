package exceptionhandling;

public class Exceptionexample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		}
		/*catch(ArithmeticException e)
		{
			b= 2;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		}*/
		
		finally
		{
			System.out.println("this is finally exception");
		}
		

	}

}

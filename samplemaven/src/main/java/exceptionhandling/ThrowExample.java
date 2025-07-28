package exceptionhandling;

public class ThrowExample {

		public static void main(String[] args) {
		int a=8;
		if (a>=18)
		{
			System.out.println("eligible for voting");
		}
		else
			{
			throw new NumberFormatException("age under 18!"); 
			}

	}

}

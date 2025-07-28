package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		int a=8;
		if (a>=18)
		{
			System.out.println("eligible for voting");
		}
		else
			{
			throw new VotingException("Age under 18!"); 
			}

	}

}

package assignments;

public class Bank {

	private int pin;
	
	public void setpin(int pin)
	
	{
		this.pin= pin;		
	}
	
	public void getpin()
	{
		if (pin==1001|| pin== 1212|| pin== 1234)
		{
			System.out.println("PIN validated successfully.");
		}
		else
		{
			System.out.println("Invalid PIN. Access denied.");
		}
	}
}

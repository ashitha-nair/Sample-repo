package assignments;

public class Salary2 extends Salary{
	int hra;
	int pf;

	public void show()
	{
		hra= basicpay*5/100;
		pf= basicpay*20/100;
		
	}

}

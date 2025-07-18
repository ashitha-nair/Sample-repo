package assignments;

public class SalaryChild extends Salary2{
	
	public void calculation()
	{
		int total= basicpay+hra-pf-deduction+bonus;
		
		System.out.println("Salary Slip");
		System.out.println("Employee Name: Varun");
		System.out.println("Basic pay: "+ basicpay);
		System.out.println("Deduction: "+ deduction);
		System.out.println("Bonus: "+ bonus);
		System.out.println("HRA: "+ hra);
		System.out.println("PF: "+ pf);
		System.out.println("Total Salary: "+ total);
		System.out.println();
	}
	public static void main(String[] args) {
		SalaryChild obj= new SalaryChild();
		obj.display(8000, 500, 4000);
				obj.show();
				obj.calculation();
	}

}

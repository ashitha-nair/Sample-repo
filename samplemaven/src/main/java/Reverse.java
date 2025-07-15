
public class Reverse {
	
		public Reverse(int num)
	{
			this ();
		int rev=0;
	while (num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
	System.out.println(rev);
	}
	public Reverse()
	{
		System.out.println("Finding reverse");
	}
	public static void main(String[] args) {
		Reverse obj=new Reverse(365);
		
	}

}

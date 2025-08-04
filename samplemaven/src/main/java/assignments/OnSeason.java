package assignments;

public class OnSeason {
	
	double price;
	String season;
	Double total;
	public void discount(double price, String season)
	{
		this.price=  price;
		this.season= season;
		
		if (season.equals("onseason"))
		{
			total= price*15/100;
			System.out.println("Eligible for Onseaon discount");
		}
			
		else
		{
			total= price*40/100;
			System.out.println("Eligible for Offseaon discount");
		}
	}

}

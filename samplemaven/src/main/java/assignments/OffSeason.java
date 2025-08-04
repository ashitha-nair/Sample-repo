package assignments;

public class OffSeason extends OnSeason{
	
	public void discount()
	{
		System.out.println(super.total);
	}

	public static void main(String[] args) {
		OffSeason obj= new OffSeason();
		obj.discount(3450, "Offseason");
obj.discount();
	}

}

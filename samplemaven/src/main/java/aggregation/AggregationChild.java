package aggregation;

public class AggregationChild {
		String city, state;
		AggregationParent ref;
		
public AggregationChild(String city, String state, AggregationParent ref)
{
	this.city=city;
	this.state=state;
	this.ref=ref;
}
public void display()
{
	System.out.println(ref.name+" "+ref.rollno+" " +ref.address+" " +city +" "+state);
	
}
	public static void main(String[] args) {
		AggregationParent obj=new AggregationParent("Ashitha", 10, "Abcd");
		AggregationChild obj1= new AggregationChild("TVM", "Kerala", obj);
		obj1.display();

	}

}

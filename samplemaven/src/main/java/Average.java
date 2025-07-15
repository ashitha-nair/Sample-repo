
public class Average {
	
	
	public void sum(int a, int b, int c)
	{
	int total= a+b+c;
	int avg = total/3;
	System.out.println("Average of integer is :"+ avg);
	}
	
	public void sum(float a, float b, float c) {
		
		float d= a+ b+ c;
		float average= d/3.0f;
		System.out.println("Average of float is: " + average);
	}
	
		public void sum(double radius) {
			double pi= 3.141592653d;
			double circle= pi*radius*radius;
			System.out.println("Area of circle is " + circle);
		}	
		
		public void sum(float area)
		{
			float square= area*area;
			System.out.println("Area of square is " + square);
			}
		
		public void sum(double length, double width)
		{
			double rectangle= length*width;
			System.out.println("Area of rectangle is " + rectangle);
			}
	
		
	public static void main(String[] args) {
		Average obj=new Average();
				obj.sum(4, 5, 7);
				obj.sum(2.3f, 3.4f, 4.4f);
				obj.sum(4d);
				obj.sum(7.4d, 8.4d);
				obj.sum(9f);

	}

}

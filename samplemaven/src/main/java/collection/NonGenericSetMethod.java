package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethod {

	public static void main(String[] args) {
		
		Set a= new HashSet();
		a.add("Car");
		a.add(85);
		Set a1= new HashSet();
		a1.add("Bike");
		a1.add(45);	

			a.addAll(a1);
			System.out.println(a);
			System.out.println(a.contains("Car"));
			System.out.println(a.containsAll(a1));
			
			a.remove("85");
			System.out.println(a);
			a.removeAll(a1);
			System.out.println(a);
		a.clear();
		System.out.println(a);
			}
		

	}



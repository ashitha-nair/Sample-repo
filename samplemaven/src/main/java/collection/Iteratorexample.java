package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorexample {

	public static void main(String[] args) {

		Set <String> s=new HashSet <String>();
		s.add("Red");
		s.add("Blue");
		s.add("Orange");
		
		Iterator i=  s.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(s);
	}

}

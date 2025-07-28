package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
s.add("Apple");
s.add("Grapes");
Set<String> s1= new HashSet<String>();
s1.add("Banana");
s1.add("Orange");

	s.addAll(s1);
	System.out.println(s);
	System.out.println(s.contains("Orange"));
	System.out.println(s.containsAll(s1));
	
	s.remove("Grapes");
	System.out.println(s);
	s.removeAll(s1);
	System.out.println(s);
s.clear();
System.out.println(s);
	}

	
}

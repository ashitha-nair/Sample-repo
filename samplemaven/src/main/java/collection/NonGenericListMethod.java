package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethod {

	public static void main(String[] args) {
		List s=new ArrayList ();
		s.add("Green");
		s.add(24);
		s.add(23.5f);
System.out.println(s);
System.out.println(s.get(2));
s.set(0, "Purple");
System.out.println(s);
System.out.println(s.indexOf(24));
s.add(24);
System.out.println(s.lastIndexOf(24));
s.remove(1);
System.out.println(s);

System.out.println(s.contains("Purple"));
System.out.println(s.isEmpty());
System.out.println(s.size());

	}

}

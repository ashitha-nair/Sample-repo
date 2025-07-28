package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Blue");
		System.out.println(l);// add elements to list.
System.out.println(l.get(2));//get an element in the specified index.

l.set(1,"black");// to set a new element to the specified index.
System.out.println(l);

l.add("Red");//made duplicate of Red.
System.out.println(l.indexOf("Red"));//show the index of duplicated value
System.out.println(l.lastIndexOf("Red"));// show last index of duplicated value
l.remove("Blue");// l.remove(3); to remove element
System.out.println(l);
		System.out.println(l.contains("black"));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
	}

}

package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CursorsExample {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(true);
		list1.add('A');
		list1.add(100);
		list1.add(1000L);
		list1.add(100.5F);
		list1.add(100.34E3D);
		list1.add("Java");
		list1.add(100);
		
		Iterator itr= list1.iterator();
		
		if(itr.hasNext()) {
			System.out.println(itr.next()); 
		}

		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Set set1 = new HashSet();
		set1.add(true);
		set1.add('A');
		set1.add(100);
		set1.add(1000L);
		set1.add(100.5F);
		set1.add(100.34E3D);
		set1.add("Java");
		set1.add(100);
		set1.add("Java");
		
		Iterator itr2 = set1.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		ListIterator itr3= list1.listIterator();		
		System.out.println(itr3.next());
		System.out.println(itr3.next());
		System.out.println(itr3.previous());
		System.out.println(itr3.previous());
	}

}

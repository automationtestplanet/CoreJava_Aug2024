package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

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
		
		
		
		List list2 = new LinkedList();
		list2.add(true);
		list2.add('A');
		list2.add(100);
		list2.add(1000L);
		list2.add(100.5F);
		list2.add(100.34E3D);
		list2.add("Java");
		list2.add(100);
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(5));
		System.out.println(list1.size());
		System.out.println(list1.contains("Java"));
		System.out.println(list1.remove(1));
		System.out.println(list1.remove("Java"));
		System.out.println(list1);
		
		List list3 = list1;
		
		System.out.println(list1.equals(list3));
		
		List list4 = new ArrayList();
		list4.add(20);
		list4.add(40);
		list4.add(10);
		list4.add(50);
		list4.add(30);
		
		System.out.println(list4);
		
		Collections.sort(list4);
		
		System.out.println(list4);
		
		Collections.sort(list4, Collections.reverseOrder());;
		
		System.out.println(list4);
		
		for(Object eachObj : list1)
			System.out.println(eachObj);
	}

}


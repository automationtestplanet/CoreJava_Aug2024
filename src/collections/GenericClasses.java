package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericClasses {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(true);
		list1.add('A');
		list1.add(100);
		list1.add(1000L);
		list1.add(100.5F);
		list1.add(100.34E3D);
		list1.add("Java");
		
		System.out.println(list1.get(list1.size()-1));
		
		String str = list1.get(list1.size()-1).toString();
		System.out.println(str);
		
		String str2 = (String)list1.get(list1.size()-1);
		System.out.println(str2);
		
//		int int1 = (int)list1.get(list1.size()-1);
//		System.out.println(int1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
//		list2.add('A');
//		list2.add(1000L);
//		list2.add(100F);
//		list2.add(10000D);
//		list2.add("String");
		
		list2.add(30);
		list2.add(50);
		list2.add(40);
		list2.add(20);

//		String str = (String)list2.get(0);
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("Banana");
		list3.add("Apple");
		list3.add("Cherry");
		
		System.out.println(list3);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee());
		empList.add(new Employee());
		empList.add(new Employee());
//		empList.add("String");
		
	}

}

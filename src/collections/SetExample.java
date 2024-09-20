package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class SetExample {

	public static void main(String[] args) {
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
		
		Set set2 = new LinkedHashSet();
		
		set2.add(true);
		set2.add('A');
		set2.add(100);
		set2.add(1000L);
		set2.add(100.5F);
		set2.add(100.34E3D);
		set2.add("Java");
		set2.add(100);
		set1.add("Java");
		
		System.out.println(set1);
//		System.out.println(set1.get(0)); // no get method to access the Set values
		
		
		for(Object eachObj : set1)
			System.out.println(eachObj);
		
		System.out.println(set2);
		
		Set set3 = new TreeSet();		
		set3.add(20);
		set3.add(40);
		set3.add(10);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		System.out.println(set3);
		
		Set set4 = new TreeSet();
		set4.add('E');
		set4.add('C');
		set4.add('D');
		set4.add('A');
		set4.add('B');
		set4.add('D');		
		System.out.println(set4);
		
		Set set5 = new TreeSet(Collections.reverseOrder());
		set5.add("Cherry");
		set5.add("Apple");
		set5.add("Banana");
		System.out.println(set5);
		

	}

}

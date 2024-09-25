package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		 Map map1 = new HashMap();
		 map1.put("Name","Raju");
		 map1.put("Qualification","BTech");
		 map1.put("Job","Software Engineer");		 
		 map1.put(null,"Software Engineer");
		 map1.put("Age",null);
		 map1.put("Salary",null);
		 
		 System.out.println(map1.get("Name"));
		 System.out.println(map1.get("Name1"));
		 
		 System.out.println(map1);
		 System.out.println(map1.entrySet());
		 
		 Set<Map.Entry> set1 = map1.entrySet();
		 
		 for(Map.Entry eachEntey : set1) {
			 System.out.println(eachEntey);
			 System.out.println(eachEntey.getKey());
			 System.out.println(eachEntey.getValue());
		 }
		 
		 Map map2 = new LinkedHashMap();
		 map2.put("Name","Raju");
		 map2.put("Qualification","BTech");
		 map2.put("Job","Software Engineer");		 
		 map2.put(null,"Software Engineer");
		 map2.put("Age",null);
		 map2.put("Salary",null);
		 System.out.println(map2);
		 
		 Map map3 = new TreeMap(Collections.reverseOrder());
		 
		 map3.put("Name","Raju");
		 map3.put("Qualification","BTech");
		 map3.put("Job","Software Engineer");		 
//		 map3.put(null,"Software Engineer");  // can not add null key in TreeMap
		 map3.put("Age",null);
		 map3.put("Salary",null);
		 System.out.println(map3);
		 
		 Map map4 = new Hashtable();
		 map4.put("Name","Raju");
		 map4.put("Qualification","BTech");
		 map4.put("Job","Software Engineer");		 
//		 map4.put(null,"Software Engineer");  // wont accept null keys
//		 map4.put("Age",null);      // wont accept null values as well
//		 map4.put("Salary",null);
		 System.out.println(map4);

	}

}

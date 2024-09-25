package collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		int[] intArr = {12,15,11,14,13};
		
		for(int eachVal: intArr)
			System.out.print(eachVal + " ");
		
		System.out.println("");
		Arrays.sort(intArr);
		
		for(int eachVal: intArr)
			System.out.print(eachVal + " ");
		
		System.out.println("");
		Arrays.asList(12,15,11,14,13).forEach(eachVal->System.out.println(eachVal));
		
		System.out.println("-------------------------------");
				
		String[] fruits = {"Apple", "Banana", "Cherry", "Banana","Apple","Apple"};
		
		int count = 0;
		for(String eachruit: fruits) {
			for(String eachruit2: fruits) {
				if(eachruit.equals(eachruit2))
					count++;
			}
			
			System.out.println(eachruit+" "+count);
			count=0;
		}
				
		Map<String,Integer> fruitsMap = new LinkedHashMap<String, Integer>();
		
		int count2= 0;
		
		for(String eachFruit : fruits) {
			if(fruitsMap.containsKey(eachFruit))
				count2 = fruitsMap.get(eachFruit)+1;
			else
				count2 = 1;			
			fruitsMap.put(eachFruit, count2);
		}
		
		
		System.out.println(fruitsMap);
		
		var fruitsMap2 = Arrays.asList(fruits).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(fruitsMap2);
		
		Arrays.asList(12,15,11,14,13).stream().sorted().limit(2).skip(1).forEach(eachVal-> System.out.println(eachVal));
		
		var newMap = "Hello this is Java".chars().mapToObj(eahChar->(char)eahChar).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(newMap);
	}

}

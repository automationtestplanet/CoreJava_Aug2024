package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
	
//		Function
		System.out.println("---------------------Function-------------------------");
		Function<String, Integer> fun1 = new Function<String, Integer>() {			
			@Override
			public Integer apply(String t) {
				return 10;
			}
		};
		
		int a = fun1.apply("Java");
		System.out.println(a);
		
		Function<String, Integer> fun2 = (input)->100;
		System.out.println(fun2.apply("Hello"));
		
//		BiFunction
		System.out.println("---------------------BiFunction-------------------------");
		BiFunction<Integer, Integer, Integer> biFun1 = new BiFunction<Integer, Integer, Integer>() {			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};		
		System.out.println(biFun1.apply(10, 20));
		
		BiFunction<Integer, Integer, Integer> biFun2 = (x,y)->x+y;
		System.out.println(biFun2.apply(10, 20));
		
		
//		Predicate
		System.out.println("---------------------Predicate-------------------------");
		Predicate<Integer> pred1 = new Predicate<Integer>() {			
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		System.out.println(pred1.test(10));
		
		Predicate<Integer> pred2 = (val1)->val1%2==0;
		System.out.println(pred2.test(11));
		
//		Consumer
		System.out.println("---------------------Consumer-------------------------");
		Consumer<Integer> cons1 = new Consumer<Integer>() {			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		cons1.accept(100);
		
		Consumer<Integer> cons2 = (val1)-> System.out.println(val1);
		cons2.accept(1000);
		
//		Supplier
		System.out.println("---------------------Supplier-------------------------");
		Supplier<Integer> supp1 = new Supplier<Integer>() {			
			@Override
			public Integer get() {
				return 1000;
			}
		};
		
		System.out.println(supp1.get());
		
		Supplier<Integer> supp2 = ()->10000;
		System.out.println(supp2.get());
		
//		Comparator
		System.out.println("---------------------Supplier-------------------------");
		Comparator<Employee> comp1 = new Comparator<Employee>() {			
			@Override
			public int compare(Employee o1, Employee o2) {
				 if(o1.getEmpId() < o2.getEmpId()) return 0;
				 else return -1;
			}
		};
		
		Comparator<Employee> comp2 = (e1,e2)-> {
			if(e1.getEmpId() < e2.getEmpId()) return 0;
			 else return -1;
		};
		

	}

}

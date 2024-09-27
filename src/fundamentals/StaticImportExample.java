package fundamentals;

import static fundamentals.StatiAndInstanceClass.*;
public class StaticImportExample {
	
	public static void main(String[] args) {
		
		System.out.println(StatiAndInstanceClass.str);
		StatiAndInstanceClass.addition(10, 20);
		
		StatiAndInstanceClass statIns = new StatiAndInstanceClass();
		System.out.println(statIns.a);
		statIns.subtraction(20,50);
		
		System.out.println(str);
		addition(10, 20);
	}

}

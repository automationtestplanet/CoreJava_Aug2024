package oops.polymorphism;

public class RuntimePolymorphism_Overriding extends Calculator {
	
	public int addition(int a,int b) {
//		System.out.println(a + b+5);		
		System.out.println(super.addition(a,b) + 5);
		return super.addition(a,b) +5;
	}
	
	public static void multiplication(int a,int b) {
		System.out.println(a * b + 100);		
	}
	
	public void division(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		RuntimePolymorphism_Overriding overriding = new RuntimePolymorphism_Overriding();
		Calculator calc = overriding;
		
		//instance methods
		overriding.addition(100, 200);
		calc.addition(100, 200);
		
		overriding.division(10,3);
//		calc.division(10,3); //  method not available in Calculator calss
		
		//static methods
		overriding.multiplication(10, 5);
		calc.multiplication(10, 5);
		
		
		
		
	}

}

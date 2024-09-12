package oops.polymorphism;

public class UpcastingAndDownCasting {

	public static void main(String[] args) {
		RuntimePolymorphism_Overriding overriding = new RuntimePolymorphism_Overriding();

		overriding.addition(10, 20);
		overriding.substraction(10, 20);
		overriding.multiplication(10, 20); // it considers the type of reference, and it executes based on the type
		overriding.division(10, 3);
		System.out.println("----------------------------------------------");
		Calculator calc = overriding;
		calc.addition(10, 20); // overrided method //instnace method overrides
		calc.substraction(10, 20);
		calc.multiplication(10, 20); // not overrided method // static methods can be overrided
//		calc.division(10, 3);  // child class methods we can not acess with the parent class reference

		calc = overriding; // Up-casting (Implicit Conversion)

		overriding = (RuntimePolymorphism_Overriding) calc; // down-casting (Explicit Conversion)

		System.out.println("----------------------------------------------");

		Calculator calc1 = new RuntimePolymorphism_Overriding(); // Up-casting
		calc1.addition(1000, 2000);
		((RuntimePolymorphism_Overriding) calc1).division(100, 3);  // down-casting

	}

}

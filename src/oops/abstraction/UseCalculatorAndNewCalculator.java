package oops.abstraction;

import accessmodifiers.Calculator;
//import accessmodifiers.NewCalculator;  // non-public lass we can not import

public class UseCalculatorAndNewCalculator extends Calculator{

	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		
//		new NewCalculator();
		
		calc.addition(10, 20);  // public access		
//		calc.substraction(10, 20); // private can not access		
//		calc.multiplication(10, 20); // protected we can not access		
//		calc.division(10, 20); // default we can not access
		
		
		UseCalculatorAndNewCalculator useCalc = new UseCalculatorAndNewCalculator();
		
		useCalc.addition(10, 20);  // public access		
//		useCalc.substraction(10, 20); // private can not access		
		useCalc.multiplication(10, 20); // protected we can access in the sub(child) class		
//		useCalc.division(10, 20); // default we can not access
	}

}

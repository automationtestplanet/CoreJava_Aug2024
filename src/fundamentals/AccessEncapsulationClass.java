package fundamentals;

import oops.encapsulation.EncapsulationClass;

public class AccessEncapsulationClass {

	public static void main(String[] args) {
		
		EncapsulationClass enCap = new EncapsulationClass();
		
//		System.out.println(enCap.name);
//		System.out.println(enCap.age);
//		System.out.println(enCap.salary);
//		enCls.name = "Raju";  // private
		enCap.setName("Raj");
		System.out.println(enCap.getName());
//		enCap.displayData(); // default -> cannot be accessed outside a package
		
		
//		enCls.name = "Raju";  // private can not be accessed out side the class
//		enCap.setBalanceAmount(100000); // protected  -> cannot be accessed outside a package  -> need inheritance
//		enCap.getBalanceAmount(); // default -> cannot be accessed outside a package
		
	}

}


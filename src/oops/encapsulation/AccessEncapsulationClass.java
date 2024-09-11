package oops.encapsulation;

public class AccessEncapsulationClass {

	public static void main(String[] args) {
		
		EncapsulationClass enCap = new EncapsulationClass();
		
//		System.out.println(enCap.name);
//		System.out.println(enCap.age);
//		System.out.println(enCap.salary);
//		enCls.name = "Raju";  // private
		enCap.setName("Raj");
		System.out.println(enCap.getName());
		enCap.displayData();
		
		
//		enCls.name = "Raju";  // private can not be accessed out side the class
		enCap.setBalanceAmount(100000); // protected  -> can be accessed with in a package class
		enCap.getBalanceAmount(); // default -> can be accessed with in a package class
		
	}

}


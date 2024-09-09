package fundamentals;

public class ClassAndObject {
	
	static int a = 1000;  // Global variables
	static int b = 2000;
	int c = 200;  // instance Variable
//	int a = 400; // duplicate Name

	public static void addition(int c, int d) { // static Method // c and d are local variables
		int a = 10;  // Local variables
		int b = 20;
		System.out.println(a+b);
//		System.out.println(c);  // Can not access instance data into static methods
		
//		modDivision();  // instance method can not be called in static method
	}

	public static void substraction() { // static Method
		int a = 30;  // Local variables
		int b = 40;
		System.out.println(a-b);
//		System.out.println(c);  // Can not access instance data into static methods		
		addition(a,b);
		
//		modDivision();  // instance method can not be called in static method

	}

	public static void multiplication() { // static Method
		int a = 50;  // Local variables
		int b = 60;
		System.out.println(a*b);
//		System.out.println(c);  // Can not access instance data into static methods
		substraction();
		
//		modDivision();  // instance method can not be called in static method
	}

	public static void division() { // static Method
		int a = 70;  // Local variables
		int b = 80;
		System.out.println(a/b);
//		System.out.println(c);  // Can not access instance data into static methods
		multiplication();
		
//		clsObjMemory1.modDivision();
//		System.out.println(clsObjMemory1.c);
	}
	
	public void modDivision() {  // instance method
		int a = 100;  // Local variables
		int b = 90;
		System.out.println(a%b);   // Can access static data into instance methods
		System.out.println(c);
		
		division();  // static method can be called in instance method
//		modDivision();  // instance method can not be called in static method
		
	}

	public static void main(String[] args) { // static Method
		int a = 100;  // Local variables
		int b = 200;
//		int a = 300; // duplicate Name we an not use
		
		addition(a,b);
		substraction();
		multiplication();
		division();
//		modDivision(); // instance method can not be called in static method
//		System.out.println(c);  // Can not access instance data into static methods	
		
		ClassAndObject clsObjMemory = new ClassAndObject();  // creation of Object/instance  // Local Variable
		
		clsObjMemory.modDivision();
		System.out.println(clsObjMemory.c);
		
		ClassAndObject clsObjMemory1 = new ClassAndObject(); 
		clsObjMemory1.modDivision();
		System.out.println(clsObjMemory1.c);
		
		clsObjMemory1.multiplication();
	}

}

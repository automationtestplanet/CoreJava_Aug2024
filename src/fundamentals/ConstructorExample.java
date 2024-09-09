package fundamentals;

public class ConstructorExample {

	boolean bool1;
	byte byte1;
	short short1;
	static char char1;
	int int1;
	static float float1;
	long long1;
	double double1;
	static String string1;

	
	public ConstructorExample() {
		this.bool1 = false;
		this.byte1 = 100;
		this.short1 = 1000;
		ConstructorExample.char1 = 'B';
		this.int1 = 10000;
		ConstructorExample.float1 = 50.5F;
		this.long1 = 10000000L;
		this.double1 = 500.876E45D;
		ConstructorExample.string1 = "Hello";
	}

	public ConstructorExample(boolean bool1, char char1, int int1, float float1, long long1, double double1,
			String string1) {
		this.bool1 = bool1;
		ConstructorExample.char1 = char1;
		this.int1 = int1;
		ConstructorExample.float1 = float1;
		this.long1 = long1;
		this.double1 = double1;
		ConstructorExample.string1 = string1;
	}

	

	public void printGlobalData() {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(ConstructorExample.char1);
		System.out.println(int1);
		System.out.println(ConstructorExample.float1);
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(ConstructorExample.string1);
	}
	
	public static void printStaticData() {
		ConstructorExample.char1 = 'C';
		ConstructorExample.float1 = 30.3F;
		ConstructorExample.string1 = "Hello Java";
		System.out.println(ConstructorExample.char1);
		System.out.println(ConstructorExample.float1);
		System.out.println(ConstructorExample.string1);
	
	}

	public static void main(String[] args) {

		
		ConstructorExample.printStaticData();
		System.out.println("---------------------------------------------------");
		ConstructorExample cons = new ConstructorExample();
		cons.printGlobalData();
//		this.printGlobalData(); // can not use this in static method
		System.out.println("---------------------------------------------------");
		ConstructorExample cons1 = new ConstructorExample(true, 'A', 1000, 100.5F, 100000L, 100.56E45D, "Java");
		cons1.printGlobalData();

		System.out.println("---------------------------------------------------");
		boolean bool1 = false;
		System.out.println(bool1);

		cons.bool1 = true;
		System.out.println(cons.bool1);
		
		

	}

}

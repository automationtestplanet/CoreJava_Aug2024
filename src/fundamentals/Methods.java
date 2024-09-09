package fundamentals;

public class Methods {

	public static void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static int substraction() {
		int a = 10;
		int b = 20;
		return a - b;
	}

	public static void multiplication(int a, int b) {
		
		System.out.println(a * b);
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static void modDvision() {
		int a = 10;
		int b = 20;
		System.out.println(a % b);
	}

	public static void main(String[] args) {

		System.out.println("-----------------------Arithematic Operators-----------------------");
		addition();  // int c = addition(); // error due to no return
//		System.out.println(addition());  // error no return value
		
		int c = substraction();  // returns the result
		multiplication(10,20);
		multiplication(100,200);
		multiplication(1000,2000);
		int d = division(10,5);
		System.out.println(d);
		d = division(100,5);
		System.out.println(d);
		
		System.out.println(division(10, 3));
//		byte e = division(10, 3); // type Conversion required
		
//		division();
	}

}


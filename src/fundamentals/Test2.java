package fundamentals;

public class Test2 {

	public static void printNumber(byte num) {
		System.out.println("this is byte number: " + num);
	}

	public static void printNumber(int num) {
		System.out.println("this is byte number: " + num);
	}

	public static void someMethod(Object o) {
		System.out.println("Object method Invoked");
	}

	public static void someMethod(String s) {
		System.out.println("String method Invoked");
	}

	public static void main(String args[]) {
		someMethod(null);
		printNumber(100);
	}

}

package oops.polymorphism;

public class CompiletimePolymorphsm_Overloading {

	int a = 10;
	int b = 20;

	public void addition() {
		System.out.println(a + b);
	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}
	
//	public int addition(int a, int b) {
//		System.out.println(a + b);
//		return a+b;
//	}
	
	public long addition(int a, long b) {
		System.out.println(a + b);
		return a+b;
	}

	public void addition(float a, float b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void addition(String a, String b) {
		System.out.println(a + b);
	}
	
	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	public void addition(int ...a) {  // varargs
		int sum = 0;
		for(int eachVal:a) {
			sum+=eachVal;
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {

		CompiletimePolymorphsm_Overloading overload = new CompiletimePolymorphsm_Overloading();

		overload.addition();
		overload.addition(100, 200);
		overload.addition(100, 200000000L);
		overload.addition(100.5F, 200.6F);
		overload.addition(100, 200,300);
		overload.addition("Hello","Java");
		overload.addition(100, 200,300, 400);
		overload.addition(100, 200,300, 400,500);
		overload.addition(100, 200,300, 400,500,600);
		overload.addition(100, 200,300, 400,500,600,700);
		overload.addition(100, 200,300, 400,500,600,700,800);
	
		
		
		
	}

}

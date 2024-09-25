package oops.abstraction;

abstract public class AbstractClassWithConstrutor {
	
	int a;
	int b;
	
	public AbstractClassWithConstrutor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void addition() {		
		System.out.println(a+b);   // Concrete Method/ Implemented method / Instance method
	}
	
	abstract public void substraction();  // Abstract method // non-concrete method/ UnImplemented method
	
	abstract public void multiplication();
	

	public static void main(String[] args) {
//		AbstractClassWithConstrutor absClsWithons = new AbstractClassWithConstrutor();

	}

}

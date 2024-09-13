package oops.abstraction;

public interface InterfaceExample {

	// all the globle variables are public static final
	int A = 100;

//	public void addition() {		  // not allowed implementation
//	}

//	abstract public void addition();
//	abstract public void substraction();
//	abstract public void multiplication();
//	abstract public void division();

	
	// shortcut to put the JavaDocs are 'Alt + Shift + j'
	/**
	 * Description:  This method performs addition on two integers
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 */
	void addition(int a, int b);

	/**
	 *  Description:  This method performs subtraction on two integers
	 * @param a
	 * @param b
	 */
	void substraction(int a, int b);

	/**
	 *  Description:  This method performs Multiplication on two integers
	 * @param a
	 * @param b
	 */
	void multiplication(int a, int b);

	/**
	 *  Description:  This method performs Division on two integers
	 * @param a
	 * @param b
	 */
	void division(int a, int b);
	
	
	default public void modDivision(int a, int b) {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
//		InterfaceExample interface1 = new InterfaceExample(); // cannot create the object
		System.out.println(A);
//		A = 200; // by default final
//		modDivision(10,3);  // can not call default methods directly.
		
	}
}

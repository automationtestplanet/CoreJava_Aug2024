package functionalinterfaces;

public class MethodReferences {
	
	void addition(int a,int b) {
		System.out.println("This is Addition Iterface Addtion method result: "+(a+b));
	}
	
	void subtraction() {
		System.out.println("This is Substraction Interface subtraction method print statments");
	}
	
	void display() {
		System.out.println("This is Method reference calss display method");
	}
	
	static int multiplication(int a, int b) {
		return a*b;
	}
	
	static void division(int a) {
		System.out.println("This is Division Interface Division method value: "+ a);
	}
	
	int modDivision(int a) {
		return a;
	}
	
	void subtraction(int a, int b) {
		System.out.println("This is Method reference calss subtraction method: "+(a-b));
	}
	
	static int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		
		// Object Reference
		MethodReferences methodRef = new MethodReferences();
		
		AdditionInterface ai1 = methodRef::addition;
		ai1.addition(10, 20);
		
		AdditionInterface ai2 = methodRef::subtraction;
		ai2.addition(10, 20);
		
		SubstractionInterface si1 = methodRef::subtraction;
//		SubstractionInterface si2 = methodRef::subtraction;
		si1.subtraction();
//		si2.subtraction(10,20);
		SubstractionInterface si3 = methodRef::display;
		si3.subtraction();
		
		
		//Static Reference
		MultiplicationInterface mi1 = MethodReferences::multiplication;		
		System.out.println(mi1.multiplication(10, 20));
		
		MultiplicationInterface mi2 = MethodReferences::sum;	
		System.out.println(mi2.multiplication(10, 20));
		
	}

}

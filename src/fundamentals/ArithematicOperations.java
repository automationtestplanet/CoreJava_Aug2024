package fundamentals;

public class ArithematicOperations {

	int c ;
	static int d;
	
	public void addition(int a,int b) {
		System.out.println(a + b);
	}

	public static void substraction(int a,int b) {
		System.out.println(a - b);
//		addition(10,20);
		
	}
	
	public void diplayCandD(int c, int d) {
		this.c = c;
		ArithematicOperations.d = d;
		this.addition(c, d);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		ArithematicOperations.substraction(10,3);
		System.out.println(ArithematicOperations.d);
		
//		System.out.println(c);
//		addition(10,20);
		
		ArithematicOperations arOp = new ArithematicOperations();
		arOp.addition(10, 20);
		System.out.println(arOp.c);
		
		
		arOp.diplayCandD(1000, 2000);
		
		System.out.println(arOp.c);
		System.out.println(arOp.d);
	}

}

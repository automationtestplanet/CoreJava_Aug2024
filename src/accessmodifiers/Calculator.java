package accessmodifiers;

public class Calculator {

	public void addition(int a,int b) {
		System.out.println(a + b);		
	}

	private void substraction(int a,int b) {
		System.out.println(a - b);		
	}
	
	protected void multiplication(int a,int b) {
		System.out.println(a * b);		
	}
	
	void division(int a, int b) {
		System.out.println(a/b);
	}
}

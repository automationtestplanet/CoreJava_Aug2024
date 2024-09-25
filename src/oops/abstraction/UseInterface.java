package oops.abstraction;

public class UseInterface implements InterfaceExample {

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void substraction(int a, int b) {
		System.out.println(a-b);
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		InterfaceExample inf1 = new UseInterface();
		
		inf1.addition(10, 20);
		inf1.substraction(10, 3);
		inf1.multiplication(5, 5);
		inf1.division(20, 7);
		
		inf1.modDivision(10, 3);

	}

	

}

package oops.abstraction;

public class UseMultipleInterfaces extends Class1 implements Interface1, Interface2, Interface3{

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
	
	public static void main(String[] args) {
		UseMultipleInterfaces useMultipleInher = new UseMultipleInterfaces();
		
		Interface1 inf1 = useMultipleInher;
		Interface2 inf2= useMultipleInher;
		Interface3 inf3 = useMultipleInher;
		Class1 cls = useMultipleInher;
		
		inf1.addition(10, 20);
		inf2.substraction(20, 7);
		inf3.multiplication(5, 3);
		cls.division(10, 3);
	}

}

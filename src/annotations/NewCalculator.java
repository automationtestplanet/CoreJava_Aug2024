package annotations;


public class NewCalculator extends Calculator{

	int a;
	
	@Override
	public void addition(int a,int b) {
		System.out.println(a + b + 5);
	}
	
	public static void main(String[] args) {
		NewCalculator calc = new NewCalculator();
		calc.addition(10, 20);
		
		Calculator calc2 = calc;
		
		calc2.addition(10, 20);
	}
}

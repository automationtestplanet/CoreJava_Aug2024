package innerclasses;

public class AnnonymusClassExample {
	
	public static void main(String[] args) {
		AbstractClass absCls = new AbstractClass() {
			@Override
			void subtraction(int a, int b) {
				System.out.println(a-b);					
			}				
		};
		
		absCls.subtraction(20, 3);
		
		
		Interface1 inf1 = new Interface1() {			
			@Override
			public void subtraction(int a, int b) {
				System.out.println(a-b);				
			}
			
			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		inf1.addition(10, 30);
		inf1.subtraction(5, 2);
	}

}

package functionalinterfaces;

@FunctionalInterface
public interface Interface1 {
	void addition(int a, int b);
	
	public static void main(String[] args) {
		
		Interface1 inf1 = new Interface1() {
			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
			}			
		};		
		inf1.addition(10, 20);
		
		
		
		
		Interface1 inf2 = (a,b)->{System.out.println(a+b);};  // lambda expression
		inf2.addition(200, 300);
	}
}

package functionalinterfaces;

//@FunctionalInterface 
public interface Interface2 {	
	void addition(int a,int b);
	void substration(int a,int b);
	
	public static void main(String[] args) {
		Interface2 inf2 = new Interface2() {
			@Override
			public void addition(int a, int b) {				
				System.out.println(a+b);
			}

			@Override
			public void substration(int a, int b) {
				System.out.println(a-b);
			}			
		};
		
		inf2.addition(10, 20);
		inf2.substration(10, 20);
		
		
//		Interface2 inf3 = (a,b)->{System.out.println(a+b);};    // can not use lambda expression
	}

}

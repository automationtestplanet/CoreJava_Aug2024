package functionalinterfaces;

public class LambdaExpressions {

	public static void main(String[] args) {
		
//		AdditionInterface ai = (a,b)-> {System.out.println(a+b);};
		AdditionInterface ai = (a,b)-> System.out.println(a+b);
		ai.addition(10,20);
		
		SubstractionInterface si = ()-> System.out.println("This is Substraction Interface");
		si.subtraction();
		
		MultiplicationInterface mi1 = (a,b)->{return a*b;};
		System.out.println(mi1.multiplication(10, 20));	
		
		MultiplicationInterface mi2 = (a,b)->a*b;
		System.out.println(mi2.multiplication(10, 20));
		
		DivisionInterface di1 = (a) -> System.out.println(a);
		di1.division(100);
		
		DivisionInterface di2 = a -> System.out.println(a);
		di2.division(100);
		
		ModularDivisionInterface mdi1 = (a)->{return a;};
		System.out.println(mdi1.modDivision(500));
		
		ModularDivisionInterface mdi2 = a->{return a;};
		System.out.println(mdi2.modDivision(500));
		
		ModularDivisionInterface mdi3 = a->a;
		System.out.println(mdi3.modDivision(500));
		

	}

}

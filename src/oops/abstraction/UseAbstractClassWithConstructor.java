package oops.abstraction;

public class UseAbstractClassWithConstructor extends AbstractClassWithConstrutor {

	public UseAbstractClassWithConstructor(int a, int b) {
		super(a, b);
	}
	
	@Override
	public void substraction() {
		System.out.println(a-b);		
	}

	@Override
	public void multiplication() {		
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		AbstractClassWithConstrutor useAbsClsWithCons = new UseAbstractClassWithConstructor(100,200);
		
		useAbsClsWithCons.addition();
		useAbsClsWithCons.substraction();
		useAbsClsWithCons.multiplication();

	}

	

}

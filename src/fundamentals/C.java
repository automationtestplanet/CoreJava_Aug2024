package fundamentals;

class A {

	static {
		System.out.println("In static A");
	}

	A() {
		System.out.println("In constructor A()");
	}
}

class B extends A {
	static {
		System.out.println("In static B");
	}

	B() {
		System.out.println("In constructor B()");
	}
}

public class C extends B {
	public static void main(String[] args) {
		C c = new C();
	}
}

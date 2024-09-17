package innerclasses;

public class OuterClass {

	static class InnerStaticClass {
		void method1() {
			System.out.println("This is Inner Static class method1");
		}
	}

	class InnerInstanceClass {
		void method2() {
			System.out.println("This is Inner Instance class method2");
		}
	}

	static { // static block
		int a = 100;
		int b = 200;
		System.out.println(a + b);
		System.out.println("This is Statc BLock");
	}

	{ // Anonymous class
		int a = 100;
		int b = 200;
		System.out.println(a + b);
		System.out.println("This is Annonymous Class");
	}
	
	public static void main(String[] args) {
		OuterClass outCls = new OuterClass();
		
		OuterClass.InnerStaticClass innerStaticCls = new InnerStaticClass();
		innerStaticCls.method1();
		
		OuterClass.InnerInstanceClass innerInstanceCls = outCls.new InnerInstanceClass();
		innerInstanceCls.method2();
		
	}

}

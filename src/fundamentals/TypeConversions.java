package fundamentals;

public class TypeConversions {

	
	public static int addition(int a,int b) {
		return a+b;
	}
	
	public static float substration(int a,int b) {
		return a-b;
	}
	
	public static long multipliction(int a,int b) {
		return a*b;
	}
	
	public static double division(int a,int b) {
		return a/b;
	}
	
	public static double modDivision(int a,int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		int addResult = addition(10,20);  // 4 bytes memory // 30
		System.out.println(addResult);
		
		byte addResult1 = (byte)addition(10,20);  // 4 bytes memory can not fit into 1 byte memory // 30   // Explicit Conversion
		System.out.println(addResult1);
		
		byte addResult2 = (byte)addition(100,200);  // 4 bytes memory can not fit into 1 byte memory // 300  // Explicit Conversion		
		System.out.println(addResult2);
		
		int subResult = (int)substration(1000,500);  // 4 bytes memory can fit into 4 bytes but loss of data // 500.0  -> 500// Explicit Conversion
		System.out.println(subResult);
		
		float mulResult = multipliction(10, 20);   // no loss of data  // 200 -> 200.0  -> Implicit Conversion
		System.out.println(mulResult);
		
		long mulResult1 = multipliction(10, 20); // no loss of data  // 200  -> Implicit Conversion
		System.out.println(mulResult1);
		
		double mulResult2 = multipliction(10, 20); // no loss of data  // 200 -> 200.0  -> Implicit Conversion
		System.out.println(mulResult2);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println((byte)128);
		System.out.println((byte)129);
		System.out.println((byte)130);
		System.out.println((byte)131);
		
		System.out.println((int)10.5); // loss of data 0.5
		
		System.out.println("-------------------------------------------------");
		
		Object additionResult = addition(500, 500);
		Object substractionResult = substration(10000, 500);
		Object multipliationResult = multipliction(100, 200);
		Object diisionResult = division(100, 3);
		Object modDivisionResult = modDivision(100, 3);
		Object object1 = "Hello";
		Object object2 = 'A';
		Object object3 = true;
		
		var additionResult1 = addition(500, 500);
		var substractionResult1 = substration(10000, 500);
		var multipliationResult1 = multipliction(100, 200);
		var diisionResult1 = division(100, 3);
		var modDivisionResult1 = modDivision(100, 3);
		var var1 = "Hello";
		var var2 = 'A';
		var var3 = true;

		System.out.println("-------------------------------------------------");
		
		String str = "100";
		System.out.println(str);
		
//		byte byte1 = (byte)str;   // non-primitive to primitive not possible -> implicit/explicit not possible 
		int a = 100;
		
//		String str2 = (String)a;  //  primitive to non-primitive not possible ->  implicit/explicit not possible
		
	}

}

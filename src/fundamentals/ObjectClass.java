package fundamentals;

public class ObjectClass {
	
	public static void display(Object obj1) {
		System.out.println(obj1);
	}

	public static void main(String[] args) {
		
		
		Object obj1 = true;
		Object obj2 = 100;
		Object obj3 = 100000L;
		Object obj4 = 'A';
		Object obj5 = 100.5F;
		Object obj6 = 100.465E34D;
		Object obj7 = "Java";
		Object obj8 = new ObjectClass();
		Object obj9 = new StringBuffer();
		Object obj10 = new StringBuilder();	
		
		boolean b1 = (boolean)obj1;
		int a = (int)obj2;
		String str = (String)obj7;
		String str1 = obj7.toString();
		
		ObjectClass obCLs = (ObjectClass)obj8;
		
		display(true);
		display(100);
		display('A');
		display(1000L);
		display(100.5F);
		display(100.36E34D);
		display("Java");
		display(new ObjectClass());
		
//		Arrays
		
//		Arrays are homogenious and size is fixed
		
//		int[] intArr = {10,20,30,40, "Java", 100F, 1000L, 345.67D};   // Arrays are Homogenious
		
//		String[] strArr = {"Java", "Hello", 100,true,'A'}; // Homogenious
		
		
		// Object Array is not homogeniuos but size is fixed 
		Object[] objArr = {true, 100, 1000L, 100.5F, 100.45E34D, "Java", 'A', new ObjectClass()};
		
		objArr[8] = new StringBuffer();
		
		
	}

}


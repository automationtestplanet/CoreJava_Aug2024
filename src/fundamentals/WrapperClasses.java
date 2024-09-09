package fundamentals;

public class WrapperClasses {

	Boolean bool1;
	Byte byte1;
	Short short1;
	Character char1;
	Integer int1;
	Float flaot1;
	Long long1;
	Double double1;

	public void printWrapperClassesData() {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(char1);
		System.out.println(int1);
		System.out.println(flaot1);
		System.out.println(long1);
		System.out.println(double1);

	}

	public static void main(String[] args) {
		WrapperClasses wrap = new WrapperClasses();
		wrap.printWrapperClassesData();

		Integer a = 100;

		int b = 200;

		a = b; // assigning primitive to non-primitive

		b = a; // assigning non-primitive to primitive

		System.out.println("-------------------------------------------------");

		String str = "100";
		System.out.println(str);

		byte byte1 = Byte.parseByte(str);   // non-primitive to primitive not possible -> implicit/explicit not possible 		
		System.out.println(byte1);
		
		short short1 = Short.parseShort(str);
		System.out.println(short1);
		
		String str2 = "Java";		
//		int int1 = Integer.parseInt(str2); //  number format error
		
		String str3 = "false";
		boolean bool1 = Boolean.parseBoolean(str3);
		System.out.println(bool1);
		
		String str4 = "hello";
		boolean bool2 = Boolean.parseBoolean(str4);
		System.out.println(bool2);
		
		System.out.println("-------------------------------------------------");		
		int c = 100;
		String string1 = String.valueOf(c) ;
		System.out.println(string1);
		
		boolean b1 = true;
		String string2 = String.valueOf(b1);
		System.out.println(string2);
	}

}

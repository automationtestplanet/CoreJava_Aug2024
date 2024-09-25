package stringclasses;

public class StringClasses {

	public static void main(String[] args) {
		
		String str = "Java";
		
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		
		System.out.println(str.concat("World"));
//		str = str.concat("World");
		System.out.println(str);
		
		System.out.println(str.hashCode());
		
		String str2 = "Java";
		
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		str2 = str2.toUpperCase();
		
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		String str3 = new String("Java");
		System.out.println(str3);
		System.out.println(str3.hashCode());
	}

}

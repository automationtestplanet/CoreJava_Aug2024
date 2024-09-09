package fundamentals;

public class StringOperations {

	public static void main(String[] args) {
		String str = "Hello Java";

		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("");
		System.out.println(str.indexOf("J"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.replace("Java", "World"));
		System.out.println(str.replace("l", "i"));

		String[] strArr = str.split(" ");

		for (String eachStr : strArr)
			System.out.println(eachStr);

		char[] charArr = str.toCharArray();

		for (char eachChar : charArr)
			System.out.print(eachChar + " ");
		System.out.println("");
		String str2 = "Hello Java World Java";
		System.out.println(str2.replace("Java", "Python"));
		System.out.println(str2.replaceFirst("Java", "Python"));

		String str3 = "ABCD1234abcd@#$ef%EF56!^&*";
		System.out.println(str3.replaceAll("[^A-Z]", ""));
		System.out.println(str3.replaceAll("[A-Z]", ""));
		System.out.println(str3.replaceAll("[^a-z]", ""));
		System.out.println(str3.replaceAll("[a-z]", ""));
		System.out.println(str3.replaceAll("[^0-9]", ""));
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^A-Za-z]", ""));
		System.out.println(str3.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str3.replaceAll("[A-Za-z0-9]", ""));

		System.out.println(str.contains("Java"));
		System.out.println(str.contains("Pyhton"));

		String str4 = "Hello Python";
		String str5 = "Hello Java";
		String str6 = "hello java";

		System.out.println(str.equals(str4));
		System.out.println(str.equals(str5));
		System.out.println(str == str5);
		System.out.println(str.equals(str6));
		System.out.println(str.equalsIgnoreCase(str6));

		System.out.println(str);
		System.out.println(str.concat(" World"));
		
		System.out.println("------------------------------");
		String str7 = "Hello";  // stores in constant pool 		
		String str8 = new String("Hello");  // heap pool / object pool
		System.out.println(str7);
		System.out.println(str8);
		
		System.out.println(str7.equals(str8));  // true
		System.out.println(str7==str8); // false		
		System.out.println(str7==str8.intern());
		
		String str9 = "";
		System.out.println(str.isBlank());
		System.out.println(str9.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str9.isEmpty());
		
		System.out.println(str);		
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(6));
		System.out.println(str.substring(1));
		

	}

}

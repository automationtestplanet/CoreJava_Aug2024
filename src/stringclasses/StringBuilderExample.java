package stringclasses;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Java");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1.append("World"));
		System.out.println(str1);	
		System.out.println(str1.hashCode());
	}

}

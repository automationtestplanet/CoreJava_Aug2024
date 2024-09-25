package stringclasses;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Java");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1.append("World"));
		System.out.println(str1);	
		System.out.println(str1.hashCode());

	}

}

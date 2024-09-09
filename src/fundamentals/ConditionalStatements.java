package fundamentals;

public class ConditionalStatements {

	public static void addition(int a, int b) {

		if (a == 0) {
			System.out.println(b);
		} else if (b == 0) {
			System.out.println(a);
		} else {
			System.out.println(a + b);
		}
	}

	public static void division(int a, int b) {
		if (b > 0) {
			System.out.println(a / b);
		} else {
			System.out.println(a);
		}

	}

	public static void main(String[] args) {
		addition(10, 0);
		addition(0, 20);
		addition(10, 20);

		division(10, 0);
		int a = 100, b = 200, c = 300;

		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}

		String language = "PYTHON";

		switch (language) {
		case "JAVA":
			System.out.println("This is Java");
			break;

		case "PYTHON":
			System.out.println("This is Python");
			break;
		case "DOTNET":
			System.out.println("This is DotNet");
			break;

		default:
			System.out.println("No language selected");
			break;
		}
		
		int num = 100;
		
		switch (num) {
		case 100:
			System.out.println("This is 100");
			break;

		case 200:
			System.out.println("This is 200");
			break;
		case 300:
			System.out.println("This is 300");
			break;

		default:
			System.out.println("No Number is selected");
			break;
		}

	}

}

package exceptions;

public class UnCheckedException extends ExceptionExample {

	public static void division(int a, int b) {
//		try {
//			System.out.println(a / b);
//		} catch (ArithmeticException ae) {
//			System.out.println("Divisible by 0 not possible");
//		}

		System.out.println(a / b);
	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		System.out.println("Program Execution Started");

		ExceptionExample unCheExp = new UnCheckedException();

//		UnCheckedException unCheExp2 = null;
		UnCheckedException unCheExp2 = (UnCheckedException) unCheExp;

		String str1 = "Java";

		int[] intArr = { 10, 20, 30, 40 };

		String str2 = null;

//		try {
//			division(100,0);
//		}catch(ArithmeticException ae) {
////			System.out.println(ae.getMessage());
////			ae.printStackTrace();
////			System.out.println(ae.getCause());
//			division(100,1);
//		}

		try {
			division(100, 5); // exception
			unCheExp2.addition(20, 30);
			System.out.println(str1.charAt(2));
			System.out.println(intArr[2]);
			System.out.println(str2.charAt(1));
		} catch (ArithmeticException ae) {

		} catch (NullPointerException ne) {

		} catch (StringIndexOutOfBoundsException strEx) {
		} catch (ArrayIndexOutOfBoundsException arrex) {
		}

		try {
			division(100, 5); // exception
			unCheExp2.addition(20, 30);
			System.out.println(str1.charAt(2));
			System.out.println(intArr[2]);
			System.out.println(str2.charAt(1));
		} catch (ArithmeticException | NullPointerException | StringIndexOutOfBoundsException
				| ArrayIndexOutOfBoundsException ae) {

		}

		try {
			division(100, 5); // exception
			unCheExp2.addition(20, 30);
			System.out.println(str1.charAt(2));
			System.out.println(intArr[2]);
			System.out.println(str2.charAt(1));
		} catch (Exception e) {

		}

		System.out.println("Program Execution Ended");

		try {
			System.out.println("Open DB Connection");
			System.out.println(100 / 0);

		} catch (Exception e) {

		} finally {
			System.out.println("Close DB Connection");
		}

	}

}

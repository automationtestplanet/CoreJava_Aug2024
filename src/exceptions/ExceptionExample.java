package exceptions;

public class ExceptionExample {

	public static void main(String[] args) throws Exception {
		System.out.println("Program Execution Started");

//		itn c = 200;

		int a = 100, b = 0;

		Thread.sleep(5000);
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}

//		System.out.println(a / b); // ABNORMAL TERMINATION

		try {
			System.out.println(a / b); // ABNORMAL TERMINATION
		} catch (Exception e) {

		}

		System.out.println("Program Execution Ended");

	}

}

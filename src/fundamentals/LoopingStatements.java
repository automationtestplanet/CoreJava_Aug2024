package fundamentals;

import java.util.Iterator;

public class LoopingStatements {

	public static void main(String[] args) {
		int a = 100;

//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);
//		System.out.println(a);

		for (int i = 1; i <= 10; i++) {
			System.out.println(a);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("9 X " + i + " = " + i * 9);
		}

		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}

		int x = 1;

		while (x <= 10) {
			System.out.println("8 X " + x + " = " + x * 8);
			x++;
		}

		int p = 11;

		do {
			System.out.println(p);
			p++;
		} while (p <= 10);

	}

}

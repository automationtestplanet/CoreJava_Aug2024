package fundamentals;

public class ArraysExample {

	public static void main(String[] args) {
		System.out.println("-------------------------------- 1D array-----------------------");
		int[] intArr = { 100, 200, 300, 400, 500 };

		System.out.println(intArr);

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);

		System.out.println("Normal For Loop");
//		 System.out.println(intArr[5]); error
		System.out.println(intArr.length);
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		System.out.println("Enhanced For Loop");

		for (int eachValue : intArr) {
			System.out.println(eachValue);
		}

		intArr[3] = 4000;

		System.out.println(intArr[3]);

		int a; // declaration
		a = 100; // initialization

		String[] fruitsArray = new String[3];

		fruitsArray[0] = "Apple";
		fruitsArray[1] = "Banana";
		fruitsArray[2] = "Cherry";

		for (String eachFruit : fruitsArray) {
			System.out.println(eachFruit);
		}

		System.out.println("-------------------------------- 2D array-----------------------");

		int[][] int2DArr = { { 10, 20, 30 }, { 100, 200, 300 }, { 1000, 2000, 3000 } };
		
		for(int[] eachArray : int2DArr) {
			for(int eachNum:eachArray) {
				System.out.println(eachNum);
			}
		}
		
		int[][] int2DArr2 = new int[3][3];
		int2DArr2[0][0] = 10000;
		int2DArr2[0][1] = 20000;
		int2DArr2[0][2] = 30000;
		int2DArr2[1][0] = 100000;
		int2DArr2[1][1] = 200000;
		int2DArr2[1][2] = 300000;
		int2DArr2[2][0] = 1000000;
		int2DArr2[2][1] = 2000000;
		int2DArr2[2][2] = 3000000;
		
		for(int[] eachArray : int2DArr2) {
			for(int eachNum:eachArray) {
				System.out.println(eachNum);
			}
		}
	}

}

package fundamentals;

public class InterviewQuestionsOnFundamentals {

	public static void swapNumbersWithThirdVariable(int a, int b) {
		System.out.println("A val: " + a);
		System.out.println("B val: " + b);
//		swap two variables with third variable
		int c = a;
		a = b;
		b = c;
		System.out.println("A val: " + a);
		System.out.println("B val: " + b);
	}

	public static void swapNumbersWithoutThirdVariable(int a, int b) {
		System.out.println("Before swap A val: " + a);
		System.out.println("Before swap B val: " + b);
		a = a + b; // 100+200 = 300
		b = a - b; // 300-200 = 100;
		a = a - b; // 300 - 100 = 200;
		System.out.println("After swap A val: " + a);
		System.out.println("AFter swap B val: " + b);
	}

	public static void swapStringsWithoutThirdVariable(String str1, String str2) {
		System.out.println("Before swap str1 val: " + str1);
		System.out.println("Before swap str2 val: " + str2);
		str1 = str1 + str2; // Hello + Java = HelloJava;
		str2 = str1.substring(0, str1.length() - str2.length()); // Hello
		str1 = str1.replace(str2, "");
		System.out.println("After swap str1 val: " + str1);
		System.out.println("After swap str2 val: " + str2);
	}

	public static void checkNumberPalindrome(int number) {
		// 121
		int revNum = 0;
		int tempNum = number;
		while (tempNum > 0) {
			int remainder = tempNum % 10; // 1, 2, 1
			revNum = (revNum * 10) + remainder; // 121
			tempNum = tempNum / 10; // 12, 1, 0
		}
		if (revNum == number)
			System.out.println(number + " is Palindrome");
		else
			System.out.println(number + " is not Palindrome");
	}

	public static void checkStringPalindrome(String str) {
		// hello -> olleh
		// abccba -> abccba
		String revStr = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			revStr = revStr + str.charAt(i);
//		}
		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr;
		}
		if (revStr.equals(str))
			System.out.println(str + " is Palindrome");
		else
			System.out.println(str + " is not Palindrome");
	}

	public static void checkNumberPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(num + " is Prime");
		else
			System.out.println(num + " is not Prime");

	}

	public static void checkNumberArmstrong(int number) {
		// 153
		int armNum = 0;
		int tempNum = number;
		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3, 5, 1
			armNum = armNum + (remainder * remainder * remainder); // 27, 152, 153
			tempNum = tempNum / 10; // 15, 1, 0
		}
		if (armNum == number)
			System.out.println(number + " is Armstrong number");
		else
			System.out.println(number + " is not Armstrong number");
	}

	public static void fibonacciSeries(int num) {
//		0 1 1 2 3 5 8 13 21
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		for (int i = 0; i <= num; i++) {
			System.out.print(b + " ");
			int c = b;
			b = a + b;
			a = c;
		}
	}

	public static void printRightHalfPyramid(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void printReverseRightHalfPyramid(int num) {
		for (int i = num; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void printGivenHighestNumberFromArray(int[] intArr, int givenNumber) {
//		{10,40,20,50,30}   -> 10,20,30,40,50 -> intArr[intArr.length-2] -> intArr[3] -> 40

		if (intArr.length - 1 >= givenNumber) {
			for (int i = 0; i < intArr.length; i++) {
				for (int j = i + 1; j < intArr.length; j++) {
					if (intArr[i] > intArr[j]) {
						int temp = intArr[i];
						intArr[i] = intArr[j];
						intArr[j] = temp;
					}
				}
			}
			System.out.println(givenNumber + "st/nd/rd highest number: " + intArr[intArr.length - givenNumber]);
		} else {
			System.out.println(givenNumber + " index not found");
		}
	}

	public static void findRepeatingNumbersFromArray(int[] intArr) {
		for (int eachNumber : intArr) {
			int count = 0;
			for (int eachNumber1 : intArr) {
				if (eachNumber == eachNumber1)
					count++;
			}
			if (count >= 2)
				System.out.println(eachNumber + " is repeating number");

			count = 0;
		}
	}

	public static void findRepeatingCharactersFromString(String str) {
		for (char eachChar : str.toCharArray()) {
			if (str.indexOf(String.valueOf(eachChar)) != str.lastIndexOf(String.valueOf(eachChar))) {
				System.out.println(eachChar + " is a repeating character");
			}
			str = str.replaceAll(String.valueOf(eachChar), "");
		}
	}

	public static void reverseWordsInASentenseWithoutChangingTheirPostion(String sentense) {
		String revSrentense = "";
		for (String eachWord : sentense.split(" ")) {
			String revWrod = "";
			for (char eachChar : eachWord.toCharArray())
				revWrod = eachChar + revWrod;
			revSrentense = revSrentense + revWrod + " ";
		}
		System.out.println(revSrentense.trim());
	}

	public static void findRepeatingWordsAndItsCountFromSentense(String sentense) {
		for (String eachWord : sentense.split(" ")) {
			int count = 0;
			for (String eachWord2 : sentense.split(" ")) {
				if (eachWord.trim().equals(eachWord2.trim()))
					count++;
			}
			if (count > 1)
				System.out.println(eachWord + " is repeating word and repeated " + count + " times");

			sentense = sentense.replaceAll(eachWord, "").trim();
		}
	}

	public static void findVowelCharactersFromString(String str) {
		for (char eachChar : str.toCharArray()) {
			if ("aeiou".contains(String.valueOf(eachChar).toLowerCase()))
				System.out.print(eachChar);
		}
	}

	public static boolean findStrings(String[] strArr, String findStr) {

		String tempStr = "";
		for (String eachStr : strArr) {
			if (findStr.contains(eachStr))
				tempStr += eachStr;
		}

		System.out.println(tempStr);
		if (findStr.equals(tempStr))
			return true;
		return false;
	}

	public static void main(String[] args) {

		System.out.println("-------------swap two numbers variables without third variable------------");
		swapNumbersWithoutThirdVariable(100, 200);
		System.out.println("");

		System.out.println("-------------swap two string variables without third variable------------");
		swapStringsWithoutThirdVariable("Hello", "Java");
		System.out.println("");

		System.out.println("----------------check given String/Number Palindrome or not -> abccba, 121-----------");
		checkNumberPalindrome(121);
		checkNumberPalindrome(123);
		checkStringPalindrome("hello");
		checkStringPalindrome("abccba");
		System.out.println("");

		System.out.println(
				"-----------------given number prime or not -> It is divisible by 1 and it self -----------------");
		checkNumberPrime(5);
		checkNumberPrime(6);
		checkNumberPrime(125);
		System.out.println("");

		System.out.println("------------given number Armstrong number--------------");
		checkNumberArmstrong(153);
		checkNumberArmstrong(143);
		System.out.println("");

		System.out.println("--------------------fibonacci series-----------------------");
		fibonacciSeries(10);
		System.out.println("");

		System.out.println("-------------------Right Half Pyramid----------------");
		printRightHalfPyramid(5);
		System.out.println("");

		System.out.println("-------------------Reverse Right Half Pyramid----------------");
		printReverseRightHalfPyramid(5);
		System.out.println("");

		System.out.println("-----------------------------Second highsest Number from array------------------");
		int[] intArr = { 10, 40, 20, 50, 30 };
		printGivenHighestNumberFromArray(intArr, 2);
		printGivenHighestNumberFromArray(intArr, 3);
		System.out.println("");

		System.out.println("---------------------Find Repeating numbers from Array---------------------------------");
		int[] intArr2 = { 10, 30, 50, 20, 10, 40, 20, 50, 10 };
		findRepeatingNumbersFromArray(intArr2);
		System.out.println("");

		System.out.println("----------------------Print repeating characters from the string--------------");
		findRepeatingCharactersFromString("Hello");
		System.out.println("");

		System.out.println(
				"-------------------Reverse words fromsentense without changing their positions------------------------");
		reverseWordsInASentenseWithoutChangingTheirPostion("Hello Java");
		reverseWordsInASentenseWithoutChangingTheirPostion("Hello Java This is Hello Java World");
		System.out.println("");

		System.out
				.println("------------------------Print repeating words and its count from sentrnse -----------------");
		findRepeatingWordsAndItsCountFromSentense("Hello Java This is Hello Java World Hello");
		System.out.println("");

		System.out.println("-----------------------Print Vowels from the given String---------------");
		findVowelCharactersFromString("Hello Java");
		System.out.println("");
		findVowelCharactersFromString("Hello Java World");
		System.out.println("");

		// String str = "abCdcAB" -> 27 28 3 30 29 1 2
		// String str = "a$bdE&H#e" -> reverse string without reversing the special
		// characters -> e$H&Edb#a
		// String str = "Abcd1234%#&56KLLCcsk" -> 1+2+3+4+5+6 -> 21

		// write a reusable program to print true or false if the given string words
		// exists in array of Strings
		// String[] strArr = {"I","Am", "Java","Programmer","At","Infosys"}
		// Input = Java -> print true
		// Input = "JavaProgrammer" -> print true
		// Input = "IProgrammer" -> print true
		// Input = "Programmer Infosys" -> print true
		// Input = "Wipro" -> print false
		// Input = "ProgrammerWipro" -> print false
		// Input = "AmWipro" -> print false
		// Input = "Infosys At" -> print false
		String[] strArr = { "I", "Am", "Java", "Programmer", "At", "Infosys" };
		System.out.println(findStrings(strArr, "Java")); // true
		System.out.println(findStrings(strArr, "JavaProgrammer")); // true
		System.out.println(findStrings(strArr, "IProgrammer")); // true
		System.out.println(findStrings(strArr, "ProgrammerInfosys")); // true
		System.out.println(findStrings(strArr, "Wipro")); // false
		System.out.println(findStrings(strArr, "ProgrammerWipro")); // false
		System.out.println(findStrings(strArr, "AmWipro")); // false
		System.out.println(findStrings(strArr, "InfosysAt")); // false

	}

}

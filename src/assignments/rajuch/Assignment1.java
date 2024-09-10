package assignments.rajuch;

public class Assignment1 {

	// write a reusable code to extract numbers from string and make the sum of
	// digits
	// Ex : String str = "Abcd1234%#&56KLLCcsk"
	// o/p: 1+2+3+4+5+6 -> 21
	// 49 + 50 + 51 + 52 + 53 + 54 = 309
	// 49-48 + 50-48 + 51-48 + 52-48 + 53-48 + 54-48 // 1 + 2 + 3 + 4 + 5 + 6 = 21;

	public static void printSumOfDigitsFromString(String str) {
		int sum = 0;
		for (char eachChar : str.replaceAll("[^0-9]", "").toCharArray()) {
			System.out.println(eachChar);
			sum += (eachChar - '0');
		}
		System.out.println(sum);
	}

	// Reverse a string without reversing the special characters
	// String str = "a$bdE&H#e" -> e$HEd&b#a

	public static void reverseStringWithoutChangingSpecialCharsPosition(String str) {
		char[] revStrArr = new char[str.length()];
		int j = str.length() - 1;
		for (int i = 0; i <= j;) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				revStrArr[i] = str.charAt(i);
				i++;
			} else if (!Character.isAlphabetic(str.charAt(j))) {
				revStrArr[j] = str.charAt(j);
				j--;
			} else {
				revStrArr[i] = str.charAt(j);
				revStrArr[j] = str.charAt(i);
				i++;
				j--;
			}
		}
		System.out.println(new String(revStrArr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSumOfDigitsFromString("Abcd1234%#&56KLLCcsk");
		reverseStringWithoutChangingSpecialCharsPosition("a$bdE&H#e");
	}

}

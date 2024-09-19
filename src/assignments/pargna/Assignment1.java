package assignments.pargna;

public class Assignment1 {

	// Write a reusable program to extract numbers from given string and print that
	// number in reverse order
	// Ex: abc12Ab#34&5Cd6&CG -> 123456 -> 654321

	public static void main(String[] args) {
		String str = "abc12Ab#34&5Cd6&CG";
		System.out.println(str.replaceAll("[^0-9]", ""));

		int number = 123456; // Number to be reversed
		int reversedNumber = 0; // Variable to store the reversed number

		// Loop until the number becomes 0
		while (number != 0) {
			int digit = number % 10; // 123456%10 = 12345
            reversedNumber = reversedNumber * 10 + digit; // Add the digit to the reversedNumber, shifting the previous digits
            number /= 10; // Remove the last digit from the original number
		}

		// Output the reversed numbers
		System.out.println("Reversed Number: " + reversedNumber);
	}



	}



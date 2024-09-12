package assignments.mounika;

public class Assignment1 {

	// Write a reusable program to print given numbers sum of digits is a prime
	// number or not
	// Ex: num = 123 = 6 -> not prime
	// num = 124 = 7 -> prime

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i = +2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int sumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}

	public static void printSumOfDigitsOfPrimeOrNot(int number) {
		int digitSum = sumOfDigits(number);
		boolean isPrimeSum = isPrime(digitSum);
		System.out.println("num = " + number + " = " + digitSum + " -> " + (isPrimeSum ? "prime" : "not prime"));
	}

	public static void main(String[] args) {
		int[] numbers = { 123, 124, 13 };
		for (int number : numbers) {
			printSumOfDigitsOfPrimeOrNot(number);
		}
	}
}
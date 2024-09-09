//package assignments.mallikarjun;

//public class Assignment1 {
public class PrimeAndArmstrong {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = 0;
        
        // Calculate number of digits in the number
        while (original != 0) {
            digits++;
            original /= 10;
        }
        
        original = num; // Reset original to num for further processing

        // Calculate the sum of each digit raised to the power of 'digits'
        while (original != 0) {
            int remainder = original % 10;
            sum += Math.pow(remainder, digits);
            original /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 2000:");
        for (int i = 1; i <= 2000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nArmstrong numbers between 1 and 2000:");
        for (int i = 1; i <= 2000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
	// Write a Java program to print prime numbers and Armstrong numbers between 1 - 2000

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	



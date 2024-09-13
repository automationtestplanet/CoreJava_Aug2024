package assignments.mallikarjun;

public class Assignment1 {
	
	// Write a Java program to print prime numbers and Armstrong numbers between 1 - 2000

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

//}
	//package assignments.mallikarjun;

	//public class Assignment1 {

	    public static void main(String[] args) {
	        // Create an instance of PrimeAndArmstrong to call its methods
	        PrimeAndArmstrong pa = new PrimeAndArmstrong();
	        
	        // Print prime numbers between 1 and 2000
	        System.out.println("Prime numbers between 1 and 2000:");
	        for (int i = 1; i <= 2000; i++) {
	            if (pa.isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        System.out.println(); // New line for better readability

	        // Print Armstrong numbers between 1 and 2000
	        System.out.println("Armstrong numbers between 1 and 2000:");
	        for (int i = 1; i <= 2000; i++) {
	            if (pa.isArmstrong(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}

	// Define a separate class for PrimeAndArmstrong
	class PrimeAndArmstrong {

	    // Method to check if a number is prime
	    public boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num == 2) return true; // 2 is the only even prime number
	        if (num % 2 == 0) return false;

	        for (int i = 3; i <= Math.sqrt(num); i += 2) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    // Method to check if a number is an Armstrong number
	    public boolean isArmstrong(int num) {
	        int originalNumber = num;
	        int sum = 0;
	        int numberOfDigits = String.valueOf(num).length();

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        return sum == originalNumber;
	    }
	}

package 
assignments.rajuch;

public class Assignment1 {

	
	// write a reusable code to extract numbers from string and make the sum of digits
	// Ex : String str = "Abcd1234%#&56KLLCcsk" 
	// o/p: 1+2+3+4+5+6 -> 21
	// 49 + 50 + 51  + 52 + 53 + 54 = 309
	// 49-48 + 50-48 + 51-48 + 52-48 + 53-48 + 54-48  //  1 + 2 + 3 + 4 + 5 + 6 = 21;
	
	
	public static void printSumOfDigitsFromString(String str) {
		
		int sum = 0;
		
		for(char eachChar : str.replaceAll("[^0-9]","").toCharArray()) {
			System.out.println(eachChar);
			sum += (eachChar-'0');
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSumOfDigitsFromString("Abcd1234%#&56KLLCcsk");

	}

}

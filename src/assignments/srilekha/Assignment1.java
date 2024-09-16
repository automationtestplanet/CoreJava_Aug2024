package assignments.srilekha;
import java.util.Arrays;
public class Assignment1 {
	
	// write a reusable program to print true or false if the given string words exists in array of Strings
	// String[] strArr = {"I","Am", "Java","Programmer","At","Infosys"}
	// Input = Java  -> print true
	// Input = "JavaProgrammer" -> print true
	// Input = "IProgrammer" -> print true
	// Input = "Programmer Infosys" -> print true
	// Input = "Wipro" -> print false
	//	Input = "ProgrammerWipro" -> print false
	//	Input = "AmWipro" -> print false
	// Input = "Infosys At" -> print false
	

	

	

	    public static boolean doesStringExist(String input, String[] strArr) {
	        // Sort the array to easily search for words
	        Arrays.sort(strArr);

	        // Loop through the input string, try to match with words in the array
	        String temp = "";
	        for (int i = 0; i < input.length(); i++) {
	            temp += input.charAt(i);

	            // If the word exists in the array
	            if (Arrays.binarySearch(strArr, temp) >= 0) {
	                // Reset temp and continue checking
	                temp = "";
	            }
	        }

	        // If temp is empty, the input string is fully composed of valid words
	        return temp.isEmpty();
	    }

	    public static void main(String[] args) {
	        String[] strArr = {"I", "Am", "Java", "Programmer", "At", "Infosys"};

	        // Test cases
	        System.out.println(doesStringExist("Java", strArr));            // true
	        System.out.println(doesStringExist("JavaProgrammer", strArr));  // true
	        System.out.println(doesStringExist("IProgrammer", strArr));     // true
	        System.out.println(doesStringExist("ProgrammerInfosys", strArr)); // true
	        System.out.println(doesStringExist("Wipro", strArr));           // false
	        System.out.println(doesStringExist("ProgrammerWipro", strArr)); // false
	        System.out.println(doesStringExist("AmWipro", strArr));         // false
	        System.out.println(doesStringExist("InfosysAt", strArr));       // false
	    }
	}



package assignments.sangita;

import java.util.Arrays;

public class Assignment1 {

	// Write a reusable program to check the given tow Strings/numbers are anagram
	// or not

	public static boolean areAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		}
		char c1[] = str1.toLowerCase().toCharArray();
		char c2[] = str2.toLowerCase().toCharArray();
		SortArray(c1);
		SortArray(c2);
		// Converting Array to String
		String s3 = new String(c1);
		String s4 = new String(c2);
		return (s3.equals(s4));
	}

	public static void SortArray(char[] Array) {
		
			for (int i = 0; i < Array.length; i++) {
				for (int j = i + 1; j < Array.length; j++) {
					if (Array[i] > Array[j]) {
						char temp = Array[i];
						Array[i] = Array[j];
						Array[j] = temp;
					}
				}
			}

		
	}

	public static void main(String args[]) {
		System.out.println(areAnagram("Listen", "Silent"));

	}
}
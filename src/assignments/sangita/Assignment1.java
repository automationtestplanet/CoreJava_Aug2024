package assignments.sangita;

import java.util.Arrays;

public class Assignment1 {
	
	// Write a reusable program to check the given tow Strings/numbers are anagram or not 

	public static boolean areAnagram(String s1, String s2)
    {
        String str1= s1.replaceAll("\\s", "");
        String str2= s2.replaceAll("\\s", "");
        
        if(str1.length() != str2.length()) 
        	{
        	return false;
            } 	
        else {
        	char c1[]= str1.toLowerCase().toCharArray();
        	char c2[]= str1.toLowerCase().toCharArray();
          	// Sort both strings
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
            }
       }
  	  public static void main(String args[])
      {
       System.out.println (areAnagram("Listen","Silent"));
         
  	  }
}


package stringclasses;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "Hello This is Java";
		for(String eachStr : str.split(" "))
			System.out.println(eachStr);
		
		String str2 = "Hello#This#is#Java";
		
		StringTokenizer strToken1 = new StringTokenizer("Hello This is Java");
		StringTokenizer strToken2 = new StringTokenizer("Hello#This#is#Java", "#");
		
		while(strToken1.hasMoreTokens())
			System.out.println(strToken1.nextToken());
		
		while(strToken2.hasMoreTokens())
			System.out.println(strToken2.nextToken());

	}

}

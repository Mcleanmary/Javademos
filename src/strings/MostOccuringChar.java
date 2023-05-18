package strings;

import java.util.Scanner;

//write logic to find number format of given number , returns result
//public char findMaxCharacterCount(String input) {
    //int asciiSize = 256;
    // Create array to keep the count of individual
    // characters and initialize the array as 0
	  // Construct character count array from the input string.
  // Initialize max count
    // Initialize result
	  // Traversing through the string and maintaining
    // the count of each character
  //return result

public class MostOccuringChar{
	
	static int asciisize=256;

	public static char max(String str) {
	int count[]=new int[asciisize];
	int len = str.length();
	for (int i=0; i<len; i++) 
		count[str.charAt(i)]++;
		
		int max= -1;
		char result=' ';
		
	for (int i=0;i<len;i++) {
		if (max<count[str.charAt(i)]) {
			max=count[str.charAt(i)];
			result=str.charAt(i);
		}
	}
		
	return result;
}
	
	public static void main(String[] args) {
		System.out.println(max("This is my sample string"));
	}

}



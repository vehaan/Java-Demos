package lab3;

import java.util.Scanner;

public class NumWordsAndChars {
	
	private static int[] counting(String input) {
		
		String str[] = input.split(" ");
		int characterCount = 0;
		for (int i = 0;i<str.length;i++) {
			characterCount += str[i].length();
		}
		
		return new int[] {str.length,characterCount};
	}
	
	private static int lineCount(String input) {
		int lineCount = 1;
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i) == '\\' && input.charAt(i+1) == 'n')
				lineCount++;
					
		}
		return lineCount;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sn.nextLine();
		int ans[] = counting(input);
		System.out.println("The word count of input string is " + ans[0] + " and the character count is " + ans[1]+".");
		System.out.println("The number of lines is " + lineCount(input) + ".");
		sn.close();
	}





}

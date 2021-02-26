package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {
	
	private static String[] sortStringArray(String[] input) {
		// TODO Auto-generated method stub
		Arrays.sort(input);
		int len = input.length/2;
		if (input.length%2 != 0)
			len = (input.length/2) + 1;
		for (int i=0;i<len;i++) {
			input[i] = input[i].toUpperCase();
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		String input[] = new String[n];
		for (int i=0;i<n;i++) {
			input[i] = sn.next();
		}
		String ans[] = sortStringArray(input);
		for (String str: ans) {
			System.out.println(str);
		}
		sn.close();

	}



}

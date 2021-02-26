package lab3;

import java.util.Scanner;

public class PositiveString {
	
	private static boolean isPositive(String input) {
		// TODO Auto-generated method stub
		String lowerInput = input.toLowerCase();
		for (int i=0;i<input.length()-1;i++) {
			if (lowerInput.charAt(i+1) <= lowerInput.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String input = sn.next();
		System.out.println(isPositive(input));
		sn.close();

	}



}

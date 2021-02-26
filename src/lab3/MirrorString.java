package lab3;

import java.util.Scanner;

public class MirrorString {
	
	private static String getImage(String input) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		input = input + "|" +  sb.toString();
		return input;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String input = sn.next();
		System.out.println(getImage(input));
		sn.close();
	}



}

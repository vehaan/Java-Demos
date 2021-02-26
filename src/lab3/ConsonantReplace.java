package lab3;

import java.util.Scanner;

public class ConsonantReplace {
	
	private static String alterString(String input) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String temp = input.toLowerCase();
		for (int i=0;i<input.length();i++) {
			if (temp.charAt(i) == 'a' || temp.charAt(i) == 'e' || temp.charAt(i) == 'i' || temp.charAt(i) == 'o' || temp.charAt(i) == 'u')
				sb.append(temp.charAt(i));
			else
				if (temp.charAt(i) == 'z')
					sb.append('a');
				else
					sb.append((char)(temp.charAt(i)+1));
			
		}
		input = sb.toString();
		return input;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String input = sn.next();
		System.out.println(alterString(input));
		sn.close();

	}



}

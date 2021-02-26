package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LineOfIntegers {
	
	private static void tokenize(String input) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(input," ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}	
	}
	
	//ANOTHER WAY OF TOKENIZING
	private static void splitting(String input) {
		String nums[] = input.split(" ");
		for (String num: nums) {
			System.out.println(num);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String input = sn.nextLine();
		tokenize(input);
		splitting(input);
		sn.close();
	}



}

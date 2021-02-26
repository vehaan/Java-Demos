package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
	
	private static int[] getSorted(int[] input) {
		for (int i = 0;i < input.length;i++) {
			String temp = Integer.toString(input[i]);
			StringBuilder sb = new StringBuilder();
			sb.append(temp);
			sb.reverse();
			input[i] = Integer.parseInt(sb.toString());
			
		}
		Arrays.sort(input);
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int input[] = new int[n];
		for (int i=0;i<n;i++) {
			input[i] = sn.nextInt();
		}
		int ans[] = getSorted(input);
		for (int num:ans) {
			System.out.println(num);
		}
		sn.close();

	}



}

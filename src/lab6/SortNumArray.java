package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumArray {
	
	private static int[] getSorted(int[] input) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		String temp;
		for (int i=0;i<input.length;i++) {
			temp = String.valueOf(input[i]);
			sb.append(temp);
			sb.reverse();
			list.add(Integer.parseInt((sb.toString())));
			sb.delete(0, sb.length());
		}
		Collections.sort(list);
		for (int i=0;i<input.length;i++)
			input[i] = list.get(i);
		return input;
	}

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Enter the number of entries: ");
			int n = sn.nextInt();
			int[] input = new int[n];
			for (int i=0;i<n;i++)
				input[i] = sn.nextInt();
			
			int[] output = getSorted(input);
			for (int num: output)
				System.out.print(num + " ");
		}

	}
}

package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {
	
	private static int getSecondSmallest(int[] input) {
		List<Integer> list = new ArrayList<>();
		for (int i=0;i<input.length;i++)
			list.add(input[i]);
		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Enter the number of entries: ");
			int n = sn.nextInt();
			int input[] = new int[n];
			for (int i=0;i<n;i++)
				input[i] = sn.nextInt();
			
			int ans = getSecondSmallest(input);
			System.out.println("The second smallest number is " + ans);
		}
		

	}



}

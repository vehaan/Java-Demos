package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumbersSquares {
	
	private static Map<Integer, Integer> getSquares(int[] input) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0;i<input.length;i++)
			map.put(input[i], input[i]*input[i]);
		return map;
	}

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Enter the number of entries you want to put: ");
			int n = sn.nextInt();
			int input[] = new int[n];
			for (int i=0;i<n;i++)
				input[i] = sn.nextInt();
			
			Map<Integer,Integer> ans = getSquares(input);
			System.out.println(ans);
		}
	}



}

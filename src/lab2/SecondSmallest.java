package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	
	static int getSecondSmallest(int input[]) {
		if (input.length < 2)
			return -1;
		Arrays.sort(input);
		return input[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int input[] = new int[n];
		for (int i=0;i<n;i++) {
			input[i] = sn.nextInt();
		}
		sn.close();
		System.out.println(getSecondSmallest(input));

	}

}

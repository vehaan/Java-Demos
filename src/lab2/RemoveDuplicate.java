package lab2;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicate {
	
	private static int[] removerDuplicate(int[] input) {
		Stack<Integer> stack = new Stack<>();
		Arrays.sort(input);
		for (int num: input) {
			if (stack.isEmpty())
				stack.push(num);
			else {
				if (stack.peek() != num)
					stack.push(num);
					
			}
		}
		
		int output[] = new int[stack.size()];
		int k = 0;
		while (!stack.isEmpty())
			output[k++] = stack.pop();
		Arrays.sort(output);
		for (int i=0,j=output.length-1;i<j;i++,j--) {
			int temp = output[i];
			output[i] = output[j];
			output[j] = temp;
		}
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int input[] = new int[n];
		for (int i=0;i<n;i++) {
			input[i] = sn.nextInt();
		}
		int output[] = removerDuplicate(input);
		for (int num : output) {
			System.out.println(num);
		}
		sn.close();

	}



}

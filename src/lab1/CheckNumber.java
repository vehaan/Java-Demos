package lab1;

import java.util.Scanner;

class NumberCheck{
	boolean checkNumber(int n) {
		String input = Integer.toString(n);
		for (int i=0;i<input.length()-1;i++) {
			if (input.charAt(i+1) < input.charAt(i))
				return false;
		}
		return true;
	}
}

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		NumberCheck check = new NumberCheck();
		System.out.println(check.checkNumber(n));
		sn.close();

	}

}

package lab1;

import java.util.Scanner;

class Calculator{
	
	int cubicSum(int n) {
		int ans = 0,digit;
		while (n != 0) {
			digit = n%10;
			n /= 10;
			ans += Math.pow(digit, 3);
		}
		return ans;
	}
	
}

public class CubicSum {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		Calculator c = new Calculator();
		int ans = c.cubicSum(n);
		System.out.println(ans);
		sn.close();
		
	}

}

package lab1;

import java.util.Scanner;

class CalculateSum{
	int calculateSum(int n) {
		int sum = 0;
		for (int i=0;i<=n;i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSum s = new CalculateSum();
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		System.out.print(s.calculateSum(n));
		sn.close();

	}

}

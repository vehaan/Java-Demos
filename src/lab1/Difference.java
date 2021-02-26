package lab1;

import java.util.Scanner;

class CalculateDifference{
	int calculateDifference(int n) {
		int squareSum = 0, sum = 0;
		for (int i=1;i<=n;i++) {
			squareSum += i*i;
			sum += i;
		}
		return squareSum - sum*sum;
	}
}

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		CalculateDifference d = new CalculateDifference();
		System.out.println(d.calculateDifference(n));
		sn.close();

	}

}

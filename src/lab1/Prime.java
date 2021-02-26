package lab1;

import java.util.Scanner;

class PrintPrime{
	void prime(int n) {
		if (n < 3)
			System.out.println("No prime numbers till n available");
			
		for (int i=3; i<=n;i = i+2) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
	
	private boolean isPrime(int m) {
		for (int i=3;i<m/2;i++) {
			if (m%i == 0)
				return false;
		}
		return true;
	}
}

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		PrintPrime p = new PrintPrime();
		p.prime(n);
		sn.close();

	}

}

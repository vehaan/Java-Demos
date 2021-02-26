package lab1;

import java.util.Scanner;

class Fib{
	int iterativeFib(int n) {
		int a = 1, b = 1,c;
		if (n < 1)
			return 0;
		if (n < 3)
			return 1;
		n -= 2;
		while (n != 0) {
			c = a + b;
			a = b;
			b = c;
			n--;
		}
		return b;
		
		
	}
	
	int recursiveFib(int n) {
		if (n <= 1)
			return n;
		return recursiveFib(n-1) + recursiveFib(n-2);
	}
}

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		Fib f = new Fib();
		System.out.println(f.iterativeFib(n));
		System.out.print(f.recursiveFib(n));
		sn.close();

	}

}

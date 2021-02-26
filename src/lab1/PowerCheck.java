package lab1;

import java.util.Scanner;

class Check{
	boolean checkNumber(int n) {
		if (n == 1)
			return true;
		if (n%2 != 0)
			return false;
		return checkNumber(n/2);
	}
}

public class PowerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		System.out.println(c.checkNumber(n));
		sn.close();

	}

}

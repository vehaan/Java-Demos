package practice;

import java.util.Scanner;

public class divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			String str = null;
			System.out.println("Enter number to be divided");
			Scanner sn = new Scanner(System.in);
			
			int x = sn.nextInt();
			result = x/0;
			System.out.println(result);
		}catch(ArithmeticException ae) {
			System.out.println("Number can't be divided by zero");
		}catch(NullPointerException ee) {
			System.out.println("NUll can't be accessed");
		}catch(Exception e) {
			System.out.println("Some error in the code");
		}
		finally {
			System.out.println("Result is" + result);
		}
		

	}

}

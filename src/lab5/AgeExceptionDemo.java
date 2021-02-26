package lab5;

import java.util.Scanner;

public class AgeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sn = new Scanner(System.in)) {
			int age = sn.nextInt();
			if (age <= 15) {
				throw new AgeException();
			}
		}catch(AgeException e) {
			System.out.println(e);
		}
	}

}

package lab5;

import java.util.Scanner;

public class NameExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		try {
		String fname = "";
		System.out.println("Enter yout last name: ");
		String lname = "";
		
			if (fname.length() == 0 && lname.length() == 0) {
				throw new NameException("Name must be of positive length!");
			}
		}catch(NameException ne) {
			System.out.println(ne);
		}catch(NullPointerException e) {
			System.out.println("Name can not be null!");
		}finally {
			sn.close();
		}

	}

}

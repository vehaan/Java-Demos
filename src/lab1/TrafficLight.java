package lab1;

import java.util.Scanner;

class Lights{
	
	void signal(String input) {
		switch (input) {
			case "Red": System.out.print("Stop");
						break;
			case "Yellow": System.out.print("Wait");
						break;
			case "Green": System.out.print("Go");
						break;
			default: System.out.print("No Signal"); 
		
		}
	}
}

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lights l = new Lights();
		System.out.println("Enter any(Red,Yellow,Green):");
		Scanner sn = new Scanner(System.in);
		String input = sn.next();
		l.signal(input);
		sn.close();
		

	}

}

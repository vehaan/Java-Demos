package lab3;

import java.util.Scanner;

public class ModifyNumber {
	
	private static int modifyNumber(int n) {
		// TODO Auto-generated method stub
		String num = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<num.length()-1;i++) {
			String temp = Math.abs(((num.charAt(i+1) - '0') - (num.charAt(i) - '0')))+"";
			sb.append(temp);
		}
		sb.append(num.charAt(num.length()-1)+"");
		String temp = sb.toString();
		int ans = Integer.parseInt(temp);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		System.out.println(modifyNumber(n));
		sn.close();

	}
}

package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Student {
	
	private static Map<String, String> getStudents(Map<String, Integer> map) {
		Map<String, String> output = new HashMap<>();
		for (Entry<String,Integer> entry: map.entrySet()) {
			if (entry.getValue() >= 90) {
				output.put(entry.getKey(), "GOLD");
			}else if(entry.getValue() >=80) {
				output.put(entry.getKey(), "SILVER");
			}else if(entry.getValue() >= 70) {
				output.put(entry.getKey(), "BRONZE");
			}
		}
		return output;
	}

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			Map<String, Integer> map = new HashMap<>();
			System.out.println("Enter the number of students: ");
			int n = sn.nextInt();
			String K;
			int V;
			for (int i=0;i<n;i++) {
				System.out.println("Enter the registration number of student " + (i+1));
				K = sn.next();
				System.out.println("Enter the total marks of " + (i+1) );
				V = sn.nextInt();
				map.put(K, V);
			}
			
			Map<String,String> ans = getStudents(map);
			System.out.println(ans);
		}
		
	}



}

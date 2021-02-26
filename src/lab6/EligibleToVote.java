package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EligibleToVote {
	
	private static List<String> votersList(Map<String, Integer> map) {
		List<String> output = new ArrayList<>();
		for (Entry<String, Integer> entry: map.entrySet()) {
			if (entry.getValue() > 18)
				output.add(entry.getKey());
		}
		return output;
	}


	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("The number of entries you want to give: ");
			Map<String, Integer> map = new HashMap<>();
			int n = sn.nextInt();
			String K;
			int V;
			for (int i=0;i<n;i++) {
				System.out.println("Enter the id of person" + (i+1));
				K = sn.next();
				System.out.println("Enter the age of person" + (i+1));
				V = sn.nextInt();
				
				map.put(K, V);
			}
			
			List<String> ans = votersList(map);
			System.out.print("The eligible voters are: ");
			for (String id:ans)
				System.out.print(id + " ");
		}

	}


}

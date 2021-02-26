package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapToSortedList {
	
	private static ArrayList<Map.Entry<String,Integer>> getValues(Map<String, Integer> map) {
		try (Scanner sn = new Scanner(System.in)) {
			map = new TreeMap<>();
			System.out.println("Enter the number of entries you want to put: ");
			int n = sn.nextInt();
			String K;
			int V;
			for (int i=0;i<n;i++) {
				System.out.println("Enter Key: ");
				K = sn.next();
				System.out.println("Enter Value: ");
				V = sn.nextInt();
				if (!map.containsKey(K))
					map.put(K, V);
			}
		}
		Map<String,Integer> ans = new TreeMap<>(map);
		Set<Map.Entry<String,Integer>> set = ans.entrySet();
		ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();
		list.addAll(set);
		return list;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		ArrayList<Map.Entry<String,Integer>> output;
		output = getValues(map);
		for (Object e:output)
			System.out.print(e + " ");
	}
}

package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
	
	private static Map<Character, Integer> countChars(char[] chars) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0;i<chars.length;i++) {
			map.put(chars[i], (map.getOrDefault(chars[i], 0) + 1));
		}
		return map;
	}

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Enter the number of character you want to put: ");
			int n = sn.nextInt();
			char chars[] = new char[n];
			for (int i=0;i<n;i++)
				chars[i] = sn.next().charAt(0);
			Map<Character,  Integer> ans = countChars(chars);
			System.out.println(ans);
		}

	}



}

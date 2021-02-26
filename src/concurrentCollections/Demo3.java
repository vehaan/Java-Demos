package concurrentCollections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

//CONCEPTS OF FOREACH,SEARCH, REDUCE

public class Demo3 {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> nameAndCities = new ConcurrentHashMap<>();
		
		nameAndCities.put("Neet", "Hyderabad");
		nameAndCities.put("Ajay", "Pune");
		nameAndCities.put("Rahul", "Bangalore");
		nameAndCities.put("Sachin", "Cuttack");
		
		//SEARCH
		String valSearch = nameAndCities.search(3, (k,v) -> v.startsWith("M")?"Success":null);
		System.out.println("Result of search is "+ valSearch);
		
		
		ConcurrentHashMap<String, Double> salaries = new ConcurrentHashMap<>();
		
		salaries.put("Nikhil",new Double(45000));
		salaries.put("Tim",new Double(23000));
		salaries.put("Nitin",new Double(34000));
		salaries.put("Sameer",new Double(49000));
		salaries.put("Ajinkya",new Double(45000));
		
		//map of Stream class
		List<Double> dblNumbers = salaries.values().stream().map((v4) -> v4*2).collect(Collectors.toList());
		
		//REDUCE
		Object totalSalary = salaries.reduce(3, (k1,v1) -> {return v1+new Double(2000);}, (v2,v3) -> Double.sum((Double)v2,(Double)v3));
		System.out.println(totalSalary.toString());
		
		ConcurrentHashMap<Integer,String> technologies = new ConcurrentHashMap<Integer, String>();
		
		technologies.put(1,"Oracle");
		technologies.put(2,"Salesforce");
		technologies.put(3,"AWS");
		technologies.put(4,".Net");
		technologies.put(5,"Servlet");
		technologies.put(6,"React");
		
		//FOREACH
		technologies.forEach(3, (k5,v5) -> {
			if (v5.equals("AWS")){
				technologies.replace(k5, "Azure");
			}
		});
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12344);
		//FOREACH ON ARRAYLIST
		list.forEach((v) -> {System.out.println(v);});
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Oracle");
		map.put(2,"Salesforce");
		map.put(3,"AWS");
		
		//FOREACH ON HASHMAP
		map.forEach((k,v) -> {System.out.println(v);});
		
		for (Entry<Integer, String> entry:technologies.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		//FOREACH ON HASHSET
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(1);
		
		set.forEach((v) -> System.out.print(v + " "));
		
		//FOREACH ON DEQUE
		Deque<Integer> q = new LinkedList<>(set);
		q.forEach((v) -> System.out.print(v + " "));
		
		

		
	}

}

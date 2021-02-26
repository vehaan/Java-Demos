package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Buggati");
		list.add("tesla");
		list.add("Maruti");
		list.add("Buggati");
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		List<String> ll = new LinkedList<>();
		ll.add("Buggati");
		ll.add("tesla");
		ll.add("Maruti");
		ll.add("Buggati");
		
		for (String car: ll) {
			System.out.println(car);
		}
		

	}

}

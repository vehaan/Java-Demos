package concurrentCollections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> nums = 
				new CopyOnWriteArrayList<>(new Integer[] {1,2,3,4});
		
		Iterator<Integer> itr = nums.iterator();
		
		nums.addIfAbsent(12);
		
		List<Integer> newList = new LinkedList<>();
		itr.forEachRemaining(newList::add);
		System.out.println(newList);
		
		Iterator<Integer> itr1 = nums.iterator();
		List<Integer> newList1 = new LinkedList<>();
		itr1.forEachRemaining(newList1::add);
		System.out.println(newList1);
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
//			System.out.println(it.next());
	
		}
		System.out.println(list);
	}

}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amit","Heena","Sumimt","Jaya","Nikhil","Ria","Heena");
		
		List<String> sortedList = names.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		//Other way of stream
		
		Stream<Integer> ints = Stream.of(1,2,3,4,5,6,7,8,9,10,22,33,45);
		ints.forEach((val) -> System.out.println(val));
		
		Stream<Integer> ints2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,});
		
		Optional<Integer> x = ints2.filter((y) -> y>5).findAny();
		
		System.out.println("data found " + x);
		
		
//		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		
		List<String> namess = Arrays.asList("Amit","Sumit","Jaya","Nikhil","Ria","Heena");
		Stream<String> y = namess.stream().filter((str) -> str.charAt(0) == 'H');
		y.forEach((v) -> System.out.println(v));
		
		namess.forEach((name) -> System.out.println(name.toUpperCase()));
		Set<String> ans = namess.stream().map((str) -> str.toUpperCase()).collect(Collectors.toSet());
//		System.out.println(namess)args;
	}

}

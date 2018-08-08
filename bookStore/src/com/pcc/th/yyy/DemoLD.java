package com.pcc.th.yyy;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class DemoLD {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		/*//old
		for(Integer integer : numbers) {
			out.println(integer);
		}*/
		//new
		numbers.forEach(System.out::println);
		numbers.stream()
			.filter(i -> i%2==0)
			.map(i -> i*2)
			.forEach(System.out::println);
		numbers.forEach(System.out::println);
	}
}

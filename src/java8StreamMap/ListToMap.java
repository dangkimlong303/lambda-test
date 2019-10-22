package java8StreamMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListToMap {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

		String string = "dang kim long";
		string.chars().parallel().forEach(str -> System.out.print((char) str));
		System.out.println();
		string.chars().parallel().forEachOrdered(str -> System.out.print((char) str));
		System.out.println();

		List<String> alphabet = Arrays.asList("a","c","e","b","z","w","j");
		alphabet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		Date date = new Date();
		System.out.println(date);
	}
}

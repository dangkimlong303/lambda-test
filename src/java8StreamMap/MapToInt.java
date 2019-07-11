package java8StreamMap;

import java.util.Arrays;
import java.util.List;

public class MapToInt {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Long", "Hanh","Hai","Thang","Huyen","An","longdkdeptrai");

		Integer lenght = names.stream().mapToInt(String::length).max().orElse(0);
		System.out.println(lenght);

		// Creating a list of Strings
		List<String> list = Arrays.asList("3", "6", "8", "14", "15");

		// Using Stream mapToInt(ToIntFunction mapper)
		// and displaying the corresponding IntStream
		list.stream().map(num -> Integer.parseInt(num))
				.filter(num -> num % 3 == 0)
				.forEach(System.out::println);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("%s%7s","longdk",""));
		stringBuilder.append("asdasd");
		System.out.println(stringBuilder.toString());
	}
}

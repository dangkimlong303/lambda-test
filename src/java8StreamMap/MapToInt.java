package java8StreamMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		String name = "long-dk-deptrai";
		System.out.println(name);
		name = name.replace("-"," ");
		System.out.println(name);

		String nameTest = "      Long a    y      s d         k                ";
		System.out.println(nameTest.trim());
		System.out.println(String.join("; ", names));

		String[] emails = {"Cheese", "Pepperoni", "Black Olives","Pepperoni","Cheese","Pepperoni"};
		System.out.println(emails.length);
		Set<String> listEmail = new HashSet<>(Arrays.asList(emails));
		listEmail.forEach(e -> System.out.println(e));
	}
}

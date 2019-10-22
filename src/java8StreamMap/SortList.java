package java8StreamMap;

import java.util.*;

public class SortList {
	public static void main(String[] args) {
		Map<String,String> a = new HashMap<>();
		a.put("place", "1st");
		a.put("race", "asd");
		Map<String,String> b = new HashMap<>();
		b.put("place", "2nd");
		b.put("race", "qwe");
		Map<String,String> c = new HashMap<>();
		c.put("place", "3rd");
		c.put("race", "plm");

		List<Map<String, String>> list = new ArrayList<>();
		list.add(c);
		list.add(a);
		list.add(b);

		System.out.println(list);
		System.out.println("after sort by place");
		list.sort((Map<String, String> a1, Map<String, String> a2) -> a1.get("place").compareTo(a2.get("place")));
		System.out.println(list);
	}
}

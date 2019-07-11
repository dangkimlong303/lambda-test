package treemaptest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreemapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("d", 4);
		map.put("e", 5);
		map.put("c", 3);
		map.put("b", 2);
		map.put("a", 1);

		System.out.println(map);


	}
}

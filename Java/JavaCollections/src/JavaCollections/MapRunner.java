package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		Map<String, Integer> occurences = new HashMap<>();
		String string = "This is an awesome occation. " + "This has never happen before.";
		String[] str = string.split("");
		for (String sr : str) {
			Integer integer = occurences.get(sr);
			if (integer == null) {
				occurences.put(sr, 1);
			} else {
				occurences.put(sr, integer + 1);
			}
		}
		System.out.println(occurences);

	}
}

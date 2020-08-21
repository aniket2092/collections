package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// only classes or interfaces allowed, no primitive data type
		HashMap<String, String> dictonary = new HashMap<>();

		dictonary.put("2", "value2");
		dictonary.put("3", "value3");
		dictonary.put("4", "value4");
		dictonary.put("5", "value5");
		dictonary.put("1", "value");
		System.out.println("HashMap");

		// no order while printing
		for (String word : dictonary.keySet()) {
			System.out.println(word);
		}

		// only classes or interfaces allowed, no primitive data type
		LinkedHashMap<String, String> dictonary1 = new LinkedHashMap<>();
		System.out.println("LinkedHashMap");
		dictonary1.put("2", "value2");
		dictonary1.put("3", "value3");
		dictonary1.put("4", "value4");
		dictonary1.put("5", "value5");
		dictonary1.put("1", "value");

		// Preserve order of insertion while printing
		for (String word : dictonary1.keySet()) {
			System.out.println(word);
			System.out.println(dictonary1.get(word));

		}
		System.out.println("EntrySet we can loop over all elements in key and value pair");
		for (Map.Entry<String, String> entry : dictonary1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// TreeMap maintains natural order , For strings natural order is alphabetical
		// order
		// For numbers it will be 1 to 10

		// only classes or interfaces allowed, no primitive data type
		TreeMap<String, String> dictonary2 = new TreeMap<>();
		System.out.println("LinkedHashMap");
		dictonary2.put("2", "value2");
		dictonary2.put("3", "value3");
		dictonary2.put("4", "value4");
		dictonary2.put("5", "value5");
		dictonary2.put("1", "value");

		// Preserve order of insertion while printing
		for (String word : dictonary2.keySet()) {
			System.out.println(word);
			System.out.println(dictonary2.get(word));

		}
		
		// for user defined method to be used inside collections like 
		//treeMAp we need to implement comparable interface and override compareTo method

	}

}

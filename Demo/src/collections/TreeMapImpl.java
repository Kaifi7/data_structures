package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<String, Integer>ts = new TreeMap<String, Integer>();
		ts.put("Jayant", 80);
		ts.put("Anushka", 80);
		ts.put("Amit", 75);
		ts.put("Danish", 40);
		ts.put("Abhishek", 90);
		
		for(Map.Entry<String, Integer>map : ts.entrySet()) {
			System.out.println(map.getKey() + " " +map.getValue());
		}
		System.out.println();
		
		for(String s : ts.keySet()) {
			System.out.print(s + " ");
		}
		
		ts.forEach((K, V) -> System.out.println("Key = " +K + " Value = " +V));
	}

}

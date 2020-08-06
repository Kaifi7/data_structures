package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		map.put("vishal", 10);
		map.put("sachin", 20);
		map.put("vaibhav", 30);
		
		System.out.println("Size of the map is : " +map.size());
		System.out.println(map);
		if(map.containsKey("vishal")) {
			System.out.println("value for key vishal is : " +map.get("vishal"));
		}
		
		// traversal of hashmap
		for(Map.Entry<String, Integer> e :map.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());
		}
		
		//using keySet() for iteration over keys
		for(String s: map.keySet()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//using values for iteration over keys 
		for(Integer s : map.values()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// using iterators
		Iterator<Map.Entry<String, Integer>>itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer>entry = itr.next();
			System.out.println("Key = " +entry.getKey() + " , Value = " +entry.getValue());
		}
		
		//using forEach(action) method to iterate map
		map.forEach((K, V)-> System.out.println("Key = " +K + " , Value = " + V));
		
		//if we want to sort hashmap we can use treeMap 
		
		//using putAll method 
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(map);
		
		// directly using treeMap constructor
		TreeMap<String, Integer>ts = new TreeMap<>(map);
	}

}

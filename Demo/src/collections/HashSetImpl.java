package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetImpl {

	public static void main(String[] args) {
		HashSet<String>courses = new HashSet<String>();
		courses.add("Big data");
		courses.add("Data Structures");
		courses.add("Algorithms");
		System.out.println(courses.size());
		
		//checking if it contains specific element
		if(courses.contains("Algorithms")) {
			System.out.println("particular course is present");
		}
		
		// removing items from HashSet using remove()
		courses.remove("Data Structures");
		for(String s : courses) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		courses.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//using iterator
		Iterator<String>i = courses.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		// to empty hashset use courses.clear() method
		
		// for sorted order using treeset
		TreeSet<String>tset = new TreeSet<String>(courses);
		
	}
	
	

}

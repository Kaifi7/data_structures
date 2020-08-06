package collections;

import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("geeks");
		tset.add("for");
		tset.add("practise");
		tset.add("contribute");
		
		for(String s : tset) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		tset.forEach(k -> System.out.print(k + " "));
	}

}

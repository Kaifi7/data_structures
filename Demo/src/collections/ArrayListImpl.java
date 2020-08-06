package collections;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {
		int n=5;
		ArrayList<Integer> arLi = new ArrayList<Integer>(n);
		for(int i=0; i<5; i++) {
			arLi.add(i);
		}
		System.out.println(arLi);
		for(int i=0; i<5; i++) {
			System.out.print(arLi.get(i) + " ");
		}
		System.out.println();
		

		//remove element at index 3
		arLi.remove(3);
		System.out.println(arLi.size());
		for(int i=0; i<arLi.size(); i++) {
			System.out.print(arLi.get(i) + " ");
		}
		System.out.println();
		
		arLi.add(1, 7);  //add element 7 at index 1
		for(int i=0; i<arLi.size(); i++) {
			System.out.print(arLi.get(i) + " ");
		}
		System.out.println();
		System.out.println(arLi.size());
		
		arLi.set(1, 9);			// this will replace value at index 1 with value 9
		System.out.println(arLi);
		
		arLi.remove(1);         // this will remove an element at index 1
		System.out.println(arLi);
		
		// iterating the array list -
		for(int i=0; i<arLi.size(); i++) {
			System.out.print(arLi.get(i) + " ");
		}
		System.out.println();
		
		//using the for each loop
		for(Integer i : arLi) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

// arrayList is not synchronized , its equivalent synchronized class in Java is vector
// arrayList inherits Abstract class and implements List interface
// arrayList cannot be used for primitive types like int, char. We need a wrapper class for such cases.


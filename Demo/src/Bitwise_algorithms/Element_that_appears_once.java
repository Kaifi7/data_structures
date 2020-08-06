package Bitwise_algorithms;

import java.util.HashMap;

public class Element_that_appears_once {

	// (3*(sum_of_array_without_duplicates) - (sum_of_array))/2;
	static int singleNumber(int arr[], int n) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		int sum =0;
		int sum_d =0;
		int j=0;
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
			if(!map.containsValue(arr[i])) {
				sum_d = sum_d + arr[i];
				map.put(j++, arr[i]);
			}
			else {
				
			}
		}
		int number = (3*sum_d - sum)/2;
		return number;
	}
	public static void main(String[] args) {
		int a[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7}; 
        int n = a.length; 
        System.out.println("The element with single " +  
                        "occurrence is " + singleNumber(a, n)); 
	}

}

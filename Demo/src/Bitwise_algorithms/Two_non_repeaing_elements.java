package Bitwise_algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Two_non_repeaing_elements {

	static void getTwoNonRepeating(int arr[]) {
		HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				count = hm.get(arr[i])+1;
				//System.out.println(arr[i] + " " + count);
				hm.replace(arr[i], count);
			}
			else {
				hm.put(arr[i], 1);
			}
			
		}
		
		for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			if(entry.getValue()==1)
				System.out.println(entry.getKey() + " " + entry.getValue());
		} 
		//hm.forEach((k,v) -> System.out.println("Key = "
          //      + k + ", Value = " + v));
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 7, 9, 11, 2, 3, 11};  
		getTwoNonRepeating(arr);
	}

}

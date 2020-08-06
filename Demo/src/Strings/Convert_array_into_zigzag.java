package Strings;

import java.util.Arrays;

public class Convert_array_into_zigzag {

	static int zigarray[] = {};
	static void zigzag(int arr[]) {
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i+=2) {
			if(i+1 < arr.length) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
	static void zigzag_2(int arr[]) {
		boolean flag = true;
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(flag) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else {
				if(arr[i]< arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			flag = !flag;
		}
	}
	public static void main(String[] args) {
		int arr[] = {4, 3, 7, 8, 6, 2, 1};
		int n = arr.length;
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		zigzag_2(arr);
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}

}

package Arrays;

import java.util.HashMap;

public class Two_repeating_elements {

	static void findRepeat(int arr[], int n) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i=0;i<n+2;i++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]) + 1;
				if(count == 2) {
					System.out.print(arr[i] + " ");
					continue;
				}
				else if(count <2)
				{
					map.put(arr[i], count);
				}
			}
			map.put(arr[i], 1);
		}
	}
	static void printRepeating(int arr[], int size) {
		int S=0;
		int P=1;
		int x, y;
		int D;
		int n = size-2, i;
		for(i=0; i<size; i++) {
			S = S + arr[i];
			P = P*arr[i];
		}
		S = S - n*(n+1)/2;
		P = P/ fact(n);
		D = (int)Math.sqrt(S*S - 4*P);
		x = (D+S)/2;
		y= (S-D)/2;
		System.out.println(x + " " +y);
	}
	static int fact(int n) {
		return (n==0)?1:n*fact(n-1);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {4,2,3,1,3,6,1};
		int n =5;
		System.out.println("Two repeating elements are : ");
		findRepeat(arr, n);
		printRepeating(arr, arr.length);
	}

}

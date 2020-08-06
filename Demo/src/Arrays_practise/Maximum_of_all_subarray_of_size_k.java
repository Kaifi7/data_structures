package Arrays_practise;

import java.util.Stack;

public class Maximum_of_all_subarray_of_size_k {

	static void print_max(int arr[], int n, int k) {
		int max_upto[] = new int[n];
		Stack<Integer>s = new Stack<>();
		s.push(0);
		for(int i=1; i<n; i++) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				max_upto[s.peek()] = i - 1;
				s.pop();
			}
			s.push(i);
		}
		while(!s.empty()) {
			max_upto[s.peek()] = n - 1;
			s.pop();
		}
		int j = 0;
		for(int i=0; i<=n-k; i++) {
			while(j<i || max_upto[j] < i+k-1) {
				j++;
			}
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {9, 7, 2, 4, 6, 8, 2, 1, 5};
		int n = arr.length;
		int k = 3;
		print_max(arr, n, k);
	}

}

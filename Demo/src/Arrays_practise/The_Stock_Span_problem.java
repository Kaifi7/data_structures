package Arrays_practise;

import java.util.Arrays;

public class The_Stock_Span_problem {

	static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	static void calculateSpan(int arr[], int n, int S[]) {
		S[0]=1;
		for(int i=1; i<n; i++) {
			int counter =1;
			while((i-counter)>=0 && arr[i]>=arr[i-counter])
				counter+=S[i-counter];
			S[i] = counter;
		}
	}
	public static void main(String[] args) {
		int price[] = { 10, 4, 5, 90, 120, 80 }; 
        int n = price.length; 
        int S[] = new int[n];  
        calculateSpan(price, n, S); 
        printArray(S); 
	}

}

package DynamicProgramming;

public class No_of_binary_strings_without_consecutive_1s {

	static int countStrings(int n) {
		int a[] = new int[n];
		int b[] = new int[n];
		a[0] = b[0] = 1;
		for(int i=1; i<n; i++) {
			a[i] = a[i-1] + b[i-1];
			b[i] = a[i-1];
		}
		return a[n-1] + b[n-1];
	}
	public static void main(String[] args) {
        System.out.println(countStrings(3)); 
	}

}

package Arrays_practise;

public class Rearrange_array_in_alternate_positive_negative {

	static void alternate(int arr[], int n) {
		int i=-1, j=n;
		while(i<j) {
			while(arr[++i] > 0);
			while(arr[--j]<0);
			if(i<j)
				swap(arr, i, j);
		}
		if(i==0 || i==n)
			return;
		printArray(arr, n);
		int k=0;
		while(k<n && i<n) {
			swap(arr, k, i);
			printArray(arr, n);
			i++;
			k+=2;
		}
	}
	static void swap(int arr[], int i, int j) {
		int c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};
		int n = arr.length;
		printArray(arr, n);
		alternate(arr, n);
		printArray(arr, n);
	}

}

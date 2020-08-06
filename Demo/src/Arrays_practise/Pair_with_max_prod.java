package Arrays_practise;

public class Pair_with_max_prod {

	static void maxProduct(int arr[], int n) {
		int lar = Integer.MAX_VALUE;
		int secLar = lar+1;
		int largest = Integer.MIN_VALUE;
		int secLargest = largest + 1;
		for(int i=0; i<n; i++) {
			if(arr[i]>=0) {
				if(arr[i]>largest) {
					secLargest = largest;
					largest = arr[i];
				}
				else if(arr[i]> secLargest && arr[i]<largest) {
					secLargest = arr[i];
				}
			}
			else {
				if(arr[i]<lar) {
					secLar = lar;
					lar = arr[i];
				}
				else if(arr[i]<secLar && arr[i]>lar) {
					secLar = arr[i];
				}
			}
		}
		int prod1 = lar*secLar;
		int prod2 = largest * secLargest;
		System.out.println((prod1>prod2)?prod1:prod2);
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 3, 6, 7, 0, -2, -23}; 
        int n = arr.length; 
        maxProduct(arr, n); 
	}

}

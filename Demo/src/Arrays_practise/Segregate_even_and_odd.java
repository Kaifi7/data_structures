package Arrays_practise;

public class Segregate_even_and_odd {

	static void segregateAndSort(int arr[], int n) {
		int left =0, right = n-1;
		while(left < right) {
			while(arr[left]%2==0 && left<right)
				left++;
			while(arr[right]%2 == 1 && left<right)
				right--;
			if(left<right) {
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
	}
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		int n = arr.length;
		segregateAndSort(arr, n);
		printArray(arr);
	}

}


public class BubbleSort {

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = {2, 14, 1, 5};
		bs.bubbleSort(arr);
		bs.printArray(arr);
	}

}
// time complexity is O(n^2);
//best case complexity is O(n) when elements are already sorted.


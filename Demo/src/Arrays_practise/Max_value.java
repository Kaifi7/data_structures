package Arrays_practise;
// find max value of a[i]-a[j] + j-i
public class Max_value {

	static int findMax(int arr[], int low, int high) {
		 int max=-1;
		while(low<high) {
			int maxValue = arr[low] - arr[high] + high-low;
			if(maxValue > max)
				max =maxValue;
			low++;
			high--;
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {9, 15, 4, 12, 13};
		int n = arr.length;
		System.out.println(findMax(arr, 0, n-1));
	}

}

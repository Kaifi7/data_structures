package Arrays;

public class Subarray_sum_positive_numbers {

	static int subArraySum(int arr[], int n, int sum) {
		int curr_sum, i, j;
		for(i=0; i<n; i++) {
			curr_sum = arr[i];
			for(j=i+1; j<=n; j++) {
				if(curr_sum == sum) {
					int p = j-1;
					System.out.println("Sum found between indexes " +i + " and " +p);
					return 1;
				}
				if(curr_sum > sum || j==n)
					break;
				curr_sum = curr_sum + arr[j];
			}
		}
		System.out.println("No subarray found");
		return 0;
	}
	static int subArraySum2(int arr[], int n, int sum) {
		int curr_sum = arr[0], start=0, i;
		for(i=1; i<n; i++) {
			while(curr_sum > sum && start < i-1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(curr_sum == sum) {
				int p = i-1;
				System.out.println("Sum found between indexes " +start + " and " +p);
				return 1;
			}
			if(i<n) {
				curr_sum = curr_sum + arr[i];
			}
		}
		System.out.println("No subarray found");
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        subArraySum(arr, n, sum);
        subArraySum2(arr, n, sum);
	}

}

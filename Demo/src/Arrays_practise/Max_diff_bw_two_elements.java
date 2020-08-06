package Arrays_practise;

public class Max_diff_bw_two_elements {

	static int maxDiff(int arr[], int size) {
		int maxDiff = -1;
		int maxRight = arr[size-1];
		for(int i=size-2; i>=0; i--) {
			if(arr[i]>maxRight)
				maxRight = arr[i];
			else {
				int diff = maxRight - arr[i];
				if(diff>maxDiff)
					maxDiff = diff;
			}
		}
		return maxDiff;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 90, 10, 110}; 
        int size = arr.length; 
        System.out.println("MaximumDifference is " +  maxDiff(arr, size));
	}

}

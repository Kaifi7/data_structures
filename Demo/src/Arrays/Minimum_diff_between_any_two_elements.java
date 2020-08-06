package Arrays;
import java.util.Arrays;
public class Minimum_diff_between_any_two_elements {

	static int findMinDiff(int arr[], int n) {
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE, diff;
		for(int i=1; i<n; i++) {
			diff = arr[i]- arr[i-1];
			if(diff < minDiff)
				minDiff = diff;
		}
		return minDiff;
	}
	private static final int MAX = 100001; 
	static int getMinDiff(int arr[], int n) {
		int freq[] = new int[MAX];
		for(int i=0; i<n; i++) {
			freq[i] = 0;
		}
		for(int i=0; i<n; i++) {
			freq[arr[i]]++;
			if(freq[arr[i]]>1)
				return 0;
		}
		int mn = Integer.MAX_VALUE;
		for(int i=0; i<MAX; i++) {
			if(freq[i]>0) {
				i++;
				int count = 1;
				while((freq[i]==0) && (i!=MAX-1)) {
					count++;
					i++;
				}
				mn = Math.min(count, mn);
				i--;
			}
		}
		return mn;
	}
	public static void main(String[] args) {
		int arr[] = new int[]{1, 5, 3, 19, 18, 25}; 
        System.out.println("Minimum difference is "+ 
                              findMinDiff(arr, arr.length));
        System.out.println("Minimum difference is "+ 
                getMinDiff(arr, arr.length));
	}

}

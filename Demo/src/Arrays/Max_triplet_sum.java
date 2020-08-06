package Arrays;

public class Max_triplet_sum {

	static int maxTripletSum(int arr[], int n) {
		int maxA = -10000000, maxB = -1000000;
		int maxC = -10000000;
		for(int i=0; i<n; i++) {
			if(arr[i]>maxA) {
				maxC = maxB;
				maxB =maxA;
				maxA = arr[i];
			}
			else if(arr[i]>maxB) {
				maxC = maxB;
				maxB = arr[i];
			}
			else if(arr[i]>maxC) {
				maxC = arr[i];
			}
		}
		return (maxA + maxB + maxC);
	}
	public static void main(String[] args) {
		int arr[] = {1, 0, 8, 6, 4, 2};
		int n = arr.length;
		System.out.println(maxTripletSum(arr, n));
	}

}

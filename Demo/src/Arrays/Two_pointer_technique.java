package Arrays;

public class Two_pointer_technique {

	static boolean isPairSum(int arr[], int n, int x) {
		int i =0;
		int j = n-1;
		while(i<j) {
			if(arr[i] + arr[j] == x)
				return true;
			else if(arr[i] + arr[j]<x) {
				i++;
			}
			else
				j--;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,5,8,12};
		if(isPairSum(arr, 5, 10))
			System.out.println("sum pair exists");
		else
			System.out.println("sum pair doesnt exists");
	}

}

package Arrays;

public class Equilibrium {

	static int equilibrium(int arr[], int n) {
		int sum = 0;
		int leftsum =0;
		for(int i=0; i<n;i++) {
			sum+=arr[i];
		}
		for(int i=0; i<n; i++) {
			sum -= arr[i];
			if(leftsum == sum) {
				return i;
			}
			leftsum += arr[i]; 
		}
		return -1;
	}
	public static void main(String[] args) {
		 int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		 System.out.println(equilibrium(arr, arr.length));
		
	}

}

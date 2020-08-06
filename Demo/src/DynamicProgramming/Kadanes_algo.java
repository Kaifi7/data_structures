package DynamicProgramming;

//largest sum contiguous sub array
public class Kadanes_algo {

	static void maxSubArraySum(int arr[], int n) {
		int max_so_far =Integer.MIN_VALUE, max_ending_here = 0, start = 0, end =0, s=0;
		for(int i=0; i<n; i++) {
			max_ending_here += arr[i];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				end = i;
				start = s;
			}
			if(max_ending_here < 0) {
				max_ending_here = 0;
				s = i+1;
			}
		}
		System.out.println("Maximum contiguous sum is : "+max_so_far);
		System.out.println("starting index : " +start);
		System.out.println("ending index : " +end);
	}
	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
        int n = a.length; 
        maxSubArraySum(a, n); 
	}

}

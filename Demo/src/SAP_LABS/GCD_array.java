package SAP_LABS;

public class GCD_array {

	static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	static int findGCD(int arr[], int n) {
		int result = arr[0];
		for(int i=0; i<n; i++) {
			result = gcd(arr[i], result);
			if(result==1)
				return 1;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 16 }; 
        int n = arr.length; 
        System.out.println(findGCD(arr, n));
	}

}

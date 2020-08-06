package Arrays_practise;

public class Max_value_arri_arrj {

	static int findValue(int arr[], int n) {
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = arr[i] + i;
			b[i] = arr[i] - i;
		}
		int x = a[0], y= a[0];
		for(int i=0; i<n; i++) {
			if(a[i]>x)
				x=a[i];
			if(a[i]<y)
				y = a[i];
		}
		int ans1 = (x-y);
		x =b[0]; y=b[0];
		for(int i=0; i<n; i++) {
			if(b[i]>x)
				x=b[i];
			if(b[i]<y)
				y=b[i];
		}
		int ans2 = (x-y);
		return Math.max(ans1, ans2);
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1};
		int n = arr.length;
		System.out.println(findValue(arr, n));
	}

}

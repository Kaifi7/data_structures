package Arrays_practise;

public class All_negative_before_positive_with_order {

	static void arrange(int arr[], int n) {
		int l =0, r = n-1;
		while(l < r) {
			if(arr[l] <0 && arr[r]>0) {
				l++;
				r--;
			}
			else if(arr[l]>0 && arr[r]<0) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
			}
			else if(arr[l]>0 && arr[r]>0) {
				r--;
			}
			else if(arr[l]<0 && arr[r]<0) {
				l++;
			}
		}
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static int[] swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	static void rearrangePosNeg(int arr[], int l, int r) {
		if(l<r) {
			int mid = l+(r-l)/2;
			rearrangePosNeg(arr, l,mid);
			rearrangePosNeg(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	static void merge(int arr[], int l, int m, int r) {
		int i=l;
		int j = m+1;
		while(i<=m && arr[i]<0)
			i++;
		while(j<=r && arr[j]<0)
			j++;
		reverse(arr, i, m);
		reverse(arr, m+1, j-1);
		reverse(arr, i, j-1);
		
	}
	static void reverse(int arr[], int l, int r) {
		if(l<r) {
			arr = swap(arr, l, r);
			reverse(arr, ++l,--r);
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, -4, 7, -3, 4, -5, -8, -9, 1, 2, -12};
		int n = arr.length;
		printArray(arr, n);
		arrange(arr, n);
		printArray(arr, n);
	}

}

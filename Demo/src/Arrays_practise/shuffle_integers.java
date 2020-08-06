package Arrays_practise;

import java.util.Arrays;

public class shuffle_integers {

	static void shuffleArray(int arr[], int f, int l) {
		if(l>f)
			return;
		if(l-f == 1)
			return;
		int mid = (l+f)/2;
		int temp = mid+1;
		int mmid = (f+mid)/2;
		for(int i=mmid+1; i<=mid; i++) {
			int temp1 = arr[i];
			arr[i] = arr[temp];
			arr[temp++] = temp1;
		}
		shuffleArray(arr, f, mid);
		shuffleArray(arr, mid+1, l);
	}
	public static void main(String[] args) {
		 int arr[] = { 1, 3, 5, 7, 2, 4, 6, 8 }; 
		 shuffleArray(arr, 0, arr.length-1);
		 System.out.println(Arrays.toString(arr));
	}

}

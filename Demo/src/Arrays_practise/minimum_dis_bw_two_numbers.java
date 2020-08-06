package Arrays_practise;

public class minimum_dis_bw_two_numbers {
	
	static int min = Integer.MAX_VALUE, indexx=-1, indexy=-1;
	static int minDis(int arr[], int n, int x, int y) {
		for(int i=0; i<n; i++) {
			if(arr[i]==x)
				indexx=i;
			if(arr[i]==y)
				indexy=i;
			if(indexx!=-1 && indexy!=-1) {
				int minDiff = Math.abs(indexx - indexy);
				if(minDiff<min)
					min = minDiff;
			}
		}
		if(min!=Integer.MAX_VALUE)
			return min;
		else
			return -1;
	}
	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}; 
		int n = arr.length;
		int x = 2, y=4;
		System.out.println(minDis(arr, n, x, y));
	}

}

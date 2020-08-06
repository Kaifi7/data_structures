package SAP_LABS;

public class Sort_0_1_2 {

	static void sort_array(int arr[], int n) {
		int low =0;
		int high = n-1;
		int mid =0, temp;
		while(mid <=high) {
			switch(arr[mid]) {
				case 0 :{
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					mid++;
					low++;
					break;
				}
				case 1: {
					mid++;
					break;
				}
				case 2: {
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					high --;
					break;
				}
			}
		}
		
	}
	static void sort_2(int arr[], int n) {
		int count_zero =0;
		int count_one =0;
		int count_two=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				count_zero++;
			}
			if(arr[i]==1) {
				count_one++;
			}
		}
		count_two = n - (count_zero + count_one);
		int i=0;
		while(count_zero>0) {
			arr[i++]=0;
			count_zero--;
		}
		while(count_one>0) {
			arr[i++]=1;
			count_one--;
		}
		while(count_two>0) {
			arr[i++]=2;
			count_two--;
		}
	}
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int n = arr.length;
		sort_2(arr, n);
		System.out.println("Array after sorting : ");
		printArray(arr);
	}

}

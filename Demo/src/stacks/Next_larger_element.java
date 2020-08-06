package stacks;

public class Next_larger_element {

	static void nextLarger(int arr[]) {
		int max = -1;
		int res[] = new int[arr.length];
		res[res.length-1]=-1;
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i] < arr[i+1]) {
				max = arr[i+1];
				res[i] = max;
			}
			else if(arr[i] < max) {
				res[i] = max;
			}
			else {
				res[i] = -1;
			}
		}
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		nextLarger(arr);
	}

}

package stacks;

import java.util.Stack;

public class Immediate_smalller_element {

	static void immediateSmaller(int arr[]) {
		int n = arr.length;
		Stack<Integer>s = new Stack<Integer>();
		for(int i=n-1; i>=0; i--) {
			s.push(arr[i]);
		}
		while(!s.isEmpty()) {
			int val = s.pop();
			if(s.size()!=0 && val>s.peek()) {
				System.out.print(s.peek() + " ");
			}
			else {
				System.out.print(-1 + " ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,6,2,3,1,7};
		immediateSmaller(arr);
	}

}

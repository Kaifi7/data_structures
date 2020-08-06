package Bitwise_algorithms;
import java.util.Stack;

public class Multiple_of_3 {

	static Stack<Integer>stack = new Stack<Integer>();
	static Stack bin(int n) {
		if(n>1)
			bin(n>>1);
		stack.add(n&1);
		return stack;
	}
	static boolean isMultipleOf3(Stack<Integer>st) {
		int count_odd =0;
		int count_even = 0;
		int count =0;
		int val;
		while(!st.isEmpty()) {
			count++;
			val = st.pop();
			if(count%2 == 0) {
				count_even += val & 1;
			}
			else {
				count_odd += val & 1;
			}
		}
		int count_diff = Math.abs(count_even - count_odd);
		return (count_diff %3 == 0)?true:false;
	}
	public static void main(String[] args) {
		 int num = 25; 
		 Stack<Integer>s = new Stack<Integer>();
		 s = bin(num);
		 System.out.println(isMultipleOf3(s));
	}

}

package Bitwise_algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Is_binary_palendrome {
	static Stack<Integer>stack = new Stack<Integer>();
	static Queue<Integer>queue = new LinkedList<Integer>();
	static void isPalindrome(int n) {
		
		if(n>1) 
			isPalindrome(n>>1);
			stack.add(n&1);
			queue.add(n&1);
	}
	static boolean isPalindromeUtil(Stack<Integer>stack, Queue<Integer>queue) {
		while(!stack.empty() && !queue.isEmpty()) {
			int p = stack.pop();
			int q = queue.poll();
			if(p!=q)
				return false;
		}
	return true;
	}
	public static void main(String[] args) {
		int n= 19;
		isPalindrome(n);
		System.out.println(isPalindromeUtil(stack, queue));
	}

}

package Bitwise_algorithms;

import java.util.Stack;

public class Flipped_bits_in_a_to_b {
	/*
	static int countSetBits(int n) {
		int count = 0;
		while(n>0) {
			count+=n&1;
			n>>=1;
		}
		return count;
	}
	static int FlippedCount(int a, int b) {
		return countSetBits(a^b);
	}
	*/
	
	static Stack<Integer>s =new Stack<Integer>();
	static Stack FlippedCount(int n) {
		if(n>1)
			FlippedCount(n>>1);
		s.push(n&1);
		return s;
	}
	static int checkCount(Stack<Integer>s1, Stack<Integer>s2) {
		int count=0;
		while(!s1.empty() && !s2.isEmpty()) {
			int p = s1.pop();
			int q = s2.pop();
			if(p==q)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		 int a = 4; 
	     int b = 11; 
	     Stack<Integer>stack1 = new Stack<Integer>();
	 	 Stack<Integer>stack2 = new Stack<Integer>();
	     stack1 = FlippedCount(a);
	     stack2 = FlippedCount(b);
	     System.out.println(stack1.size() + " " + stack2.size());
	     System.out.println(checkCount(stack1, stack2));
	}

}

package Bitwise_algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Turn_off_a_particular_bit {

	static int turnOffK(int n, int k) {
		if(k<=0)
			return n;
		
		
		//do & of n with a number with all sets except the k'th bit
		return (n & ~( 1 << (k-1)));
	}
	static Stack<Integer>stack = new Stack<Integer>();
	static Stack bin(int n) {
		if(n>1)
			bin(n>>1);
		stack.push(n&1);
		return stack;
	}
	static int turnOff(Stack<Integer>s, int k) {
		int count =1;
		int result =0;
		int i=0;
		int p;
		while(!s.isEmpty()) {
			p = s.pop();
			//System.out.print(p + " ");
			if(count==k) {
				p=0;
			}
			result = result + (int)Math.pow(2, i)*p;
			count++;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		int n = 15; 
        int k = 5; 
        Stack<Integer>stack1 = new Stack<Integer>();
        stack1 = bin(n);
        //System.out.println(stack1);
        System.out.println(turnOff(stack1, k));
        
	}

}

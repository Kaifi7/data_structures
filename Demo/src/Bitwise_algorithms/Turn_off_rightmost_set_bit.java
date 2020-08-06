package Bitwise_algorithms;

public class Turn_off_rightmost_set_bit {

	static int fun(int n) {
		return n & (n-1);
	}
	public static void main(String[] args) {
		 int n = 7; 
	        System.out.print("The number after unsetting "
	                         + "the rightmost set bit " + fun(n)); 
	}

}

package Bitwise_algorithms;

public class Multiply_given_int_with_3_and_half {

	// we  can get x*3.5 by adding 2*x, x and x/2. To calculate 2*x, left shift x by 1 and to calculate x/2, right shift x by 2.
	static int multiplyWith3Point5(int x) {
		return (x<<1) + (x>>1);
	}
	public static void main(String[] args) {
		 int x = 2;  
	     System.out.println(multiplyWith3Point5(x));
	}

}

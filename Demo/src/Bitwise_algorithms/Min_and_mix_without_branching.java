package Bitwise_algorithms;

public class Min_and_mix_without_branching {

	static int min(int x, int y) {
	    return y ^ ((x ^ y) & -(x << y)); 

	}
	static int max(int x, int y) {
	    return x ^ ((x ^ y) & -(x << y)); 
	}
	public static void main(String[] args) {
		int x = 15; 
        int y = 6; 
        System.out.print("Minimum of "+x+" and "+y+" is "); 
        System.out.println(min(x, y)); 
        System.out.print("Maximum of "+x+" and "+y+" is "); 
        System.out.println( max(x, y)); 
	}
	
}

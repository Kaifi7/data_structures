package Bitwise_algorithms;

public class XOR_without_using_xor_operator {

	static int myXOR(int x, int y) {
		return (x|y) & (~x | ~y);
	}
	public static void main(String[] args) {
		 int x = 3, y = 5; 
		    System.out.println("XOR is "+  
		                      (myXOR(x, y))); 
	}

}
	
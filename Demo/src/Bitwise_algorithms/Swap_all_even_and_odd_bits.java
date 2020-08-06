package Bitwise_algorithms;

public class Swap_all_even_and_odd_bits {

	static int swapBits(int x) {
		int even_bits = x & 0xAAAAAAAA;
		int odd_bits = x & 0x55555555;
		even_bits >>=1;
		odd_bits <<=1;
		return (even_bits | odd_bits);
	}
	public static void main(String[] args) {
		int x = 23; // 00010111 
	      
        // Output is 43 (00101011) 
        System.out.println(swapBits(x)); 
	}

}

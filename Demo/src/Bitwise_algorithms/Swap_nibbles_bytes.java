package Bitwise_algorithms;

public class Swap_nibbles_bytes {

	static int swapNibbles(int x) {
		return ((x & 0X0F) <<4 | (x & 0XF0) >>4);
	}
	public static void main(String[] args) {
		int x = 100;
		System.out.println(swapNibbles(x));
	}

}

package Bitwise_algorithms;

public class Swap_without_using_third_var {
	
	public static void main(String[] args) {
		int x=10;
		int y=5;
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("After swap: x=" +x + " , y = " +y);
	}

}

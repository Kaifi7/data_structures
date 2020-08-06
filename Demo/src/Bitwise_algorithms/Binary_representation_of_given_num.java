package Bitwise_algorithms;

public class Binary_representation_of_given_num {

	static void bin(int n) {
		if(n>1)
			bin(n>>1);
		System.out.printf("%d", n&1);
	}
	public static void main(String[] args) {
		bin(7); 
	    System.out.println(); 
	    bin(4);
	}

}
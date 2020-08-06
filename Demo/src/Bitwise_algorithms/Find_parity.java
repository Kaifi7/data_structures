package Bitwise_algorithms;

public class Find_parity {

	static boolean getParity(int n) {
		boolean parity = false;
		while(n!=0) {
			parity = !parity;
			n = n & (n-1);
		}
		return parity;
	}
	public static void main(String[] args) {
		int n = 12; 
        System.out.println("Parity of no " + n + " = " + 
                         (getParity(n)? "odd": "even"));
	}

}

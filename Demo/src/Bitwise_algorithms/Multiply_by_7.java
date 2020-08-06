package Bitwise_algorithms;

public class Multiply_by_7 {

	static int multiplyBySeven(int n) {
		return ((n<<3)-n);
	}
	public static void main(String[] args) {
		 int n = 4; 
	     System.out.println(multiplyBySeven(n)); 
	}

}

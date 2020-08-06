package Bitwise_algorithms;

public class Number_is_power_of_two {

	static boolean isPowerOfTwo(int n) {
		int count =0;
		while(n>0) {
			count+= n&1;
			n>>=1;
		}
		return (count==1)?true:false;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(31) ? "Yes" : "No"); 
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No"); 
	}

}

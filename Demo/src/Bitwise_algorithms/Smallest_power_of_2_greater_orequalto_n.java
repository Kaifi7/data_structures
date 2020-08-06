package Bitwise_algorithms;

public class Smallest_power_of_2_greater_orequalto_n {

	static int nextPowerOf2(int n) {
		if(n > 0 && (n & (n-1)) == 0)
			return n;
		int p =1;
		while(p<n) {
			p<<=1;
		}
		return p;
	}
	public static void main(String[] args) {
		int n = 5; 
        System.out.println(nextPowerOf2(n)); 
	}

}

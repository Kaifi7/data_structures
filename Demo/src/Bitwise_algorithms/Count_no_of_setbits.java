package Bitwise_algorithms;

public class Count_no_of_setbits {

	static int countSetBits(int n) {
		int count =0;
		while(n > 0) {
			count += n&1;
			n>>=1;
		}
		return count;
		/* recursive
		 * if(n==0)
		 * 		return 0;
		 * else
		 * 		return (n&1) + countSetBits(n>>=1);
		 */
	}
	public static void main(String[] args) {
		int i = 9; 
        System.out.println(countSetBits(i)); 
	}

}

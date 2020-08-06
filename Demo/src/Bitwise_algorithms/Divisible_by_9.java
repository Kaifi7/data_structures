package Bitwise_algorithms;

public class Divisible_by_9 {

	static boolean isDivBy9(int n) {
		if(n==0 || n==9)
			return true;
		if(n < 9)
			return false;
		//if n is greater than 9 then recur for [floor(n/9) - n%8]
		return isDivBy9((int)(n>>3) - (int) (n&7));
	}
	public static void main(String[] args) {
		 for (int i = 0; i < 100; i++) 
	            if (isDivBy9(i)) 
	                System.out.print(i + " "); 
	}

}

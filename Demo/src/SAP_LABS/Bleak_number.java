package SAP_LABS;
//a number n is bleak if it cannot be represented as sum of positive number x and set bit counts in x ie..x+setbitcount(x);
public class Bleak_number {

	static int countSetBits(int x) {
		int count =0;
		while(x!=0) {
			x &= (x-1);
			count++;
		}
		return count;
	}
	static boolean isBleak(int n) {
		for(int x=1; x<n; x++) {
			if(x + countSetBits(x) == n)
				return false;
		}
		return true;
	}
	static int ceilLog2(int x) {
		int count =0;
		x--;
		while(x>0) {
			x = x>>1;
			count++;
		}
		return count;
	}
	static boolean isBleak_2(int n) {
		for(int x=n-ceilLog2(n); x<n; x++) {
			if(x + countSetBits(x) == n)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		 if (isBleak(3)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	        if (isBleak(4)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No");
	}

}

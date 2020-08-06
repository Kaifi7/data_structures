package Bitwise_algorithms;

public class Power_of_4 {
	
	static boolean isPowerOfFour(int test_no) {
		int m =1;
		int count =0;
		int s = test_no & (test_no-1);
		if(test_no > 0 && s ==0) {
			System.out.println("ssasa");
				while(test_no > 1) {
					count+=test_no^1;
					test_no>>=1;
					if((test_no^1) ==0)
						break;
				}
				System.out.println(count);
			return (count%2 == 0)?true:false;
		}
		return false;
	}
	public static void main(String[] args) {
		int test_no = 256; 
        
        if(isPowerOfFour(test_no)) 
            System.out.println(test_no + 
                               " is a power of 4"); 
        else
            System.out.println(test_no + 
                               " is not a power of 4");
	}

}

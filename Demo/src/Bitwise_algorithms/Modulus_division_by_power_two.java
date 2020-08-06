package Bitwise_algorithms;

public class Modulus_division_by_power_two {

	static int getModulo(int n, int d) {
		int count =0;
		int pos =0;
		/*
		while(d>0) {
			count = d&1;
			d>>=1;
			if(count!=1)
				pos++;
			else
				break;
		}
	*/
		return (n & (d-1));
	}
	public static void main(String[] args) {
		 int n = 6; 
         
	        /*d must be a power of 2*/
	        int d = 4;  
	          
	        System.out.println(n+" moduo " + d +  
	                    " is " + getModulo(n, d)); 
	}

}

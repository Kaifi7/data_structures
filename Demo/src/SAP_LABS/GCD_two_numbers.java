package SAP_LABS;

public class GCD_two_numbers {

	static int gcd(int a, int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a, b-a);
	}
	static int gcd_2(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		int a = 98, b = 56; 
        System.out.println("GCD of " + a +" and " + b + " is " + gcd_2(a, b)); 
        
	}

}

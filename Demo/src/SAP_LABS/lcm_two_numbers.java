package SAP_LABS;

public class lcm_two_numbers {

	static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	static int lcm_2(int a, int b) {
		int lar = Math.max(a, b);
		int small = Math.min(a, b);
		for(int i=lar; ; i+=lar) {
			if(i%small == 0)
				return i;
		}
	}
	public static void main(String[] args) {
		 int a = 5, b = 7; 
	        System.out.println( "LCM of " + a + " and "
	            + b + " is " + lcm(a, b)); 
	}

}

package SAP_LABS;

public class LCM_array {

	static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	static int lcm(int a, int b) {
		return (a*b)/gcd(a, b);
	}
	static int lcm_of_array_elements(int element_array[]) {
		int result = element_array[0];
		for(int i=1; i<element_array.length; i++) {
			result = lcm(element_array[i], result);
		}
		return result;
	}
	public static void main(String[] args) {
		 int[] element_array = { 2, 7, 3, 9, 4 }; 
	     System.out.println(lcm_of_array_elements(element_array));
	}

}

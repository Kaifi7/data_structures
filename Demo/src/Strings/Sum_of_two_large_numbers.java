package Strings;

public class Sum_of_two_large_numbers {

	static void findSum(String s1, String s2) {
		if(s1.length() > s2.length()) {
			String t = s1;
			s1 = s2;
			s2 = t;
		}
		String str = "";
		int n1=s1.length(), n2=s2.length();
		s1 = new StringBuilder(s1).reverse().toString();
		s2 = new StringBuilder(s2).reverse().toString();
		int carry = 0;
		for(int i=0; i<n1; i++) {
			int sum = (int)(s1.charAt(i)-'0') + (int)(s2.charAt(i) - '0') + carry;
			str+= (char)(sum%10 + '0');
			carry = sum/10;
		}
		for(int i=n1; i<n2; i++) {
			int sum = ((int)(s2.charAt(i)-'0') + carry);
			str+= (char)(sum%10 + '0');
			carry = sum/10;
		}
		if(carry > 0)
			str+=(char)(carry + '0');
		str = new StringBuilder(str).reverse().toString();
		System.out.println(str.substring(0, str.length()));
	}
	public static void main(String[] args) {
		String s1 = "12";
		String s2 = "19811";
		findSum(s1, s2);
	}

}

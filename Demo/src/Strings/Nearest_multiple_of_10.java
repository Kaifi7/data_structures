package Strings;

public class Nearest_multiple_of_10 {

	static void roundNum(StringBuilder str) {
		int n = str.length();
		if(str.toString() == "")
			return;
		if(str.charAt(n-1) - '0' <=5) {
			str.setCharAt(n-1, '0');
			System.out.println(str.substring(0, n));
		}
		else {
			int carry = 0;
			str.setCharAt(n-1, '0');
			int i = n-2;
			carry=1;
			while(i>=0 && carry==1) {
				int currentDigit = str.charAt(i)-'0';
				currentDigit+=carry;	
				if(currentDigit > 9) {
					carry = 1;
					currentDigit = 0;
				}
				else {
					carry = 0;
				}
				str.setCharAt(i, (char)(currentDigit + '0'));
				i--;
			}
			if(carry==1)
				System.out.println(carry);
			System.out.println(str.substring(0, n));
		}
		
	}
	public static void main(String[] args) {
		String str = "99999999999999993";
		StringBuilder ss = new StringBuilder(str);
		roundNum(ss);
	}

}

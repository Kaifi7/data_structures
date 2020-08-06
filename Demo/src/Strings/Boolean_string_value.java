package Strings;

public class Boolean_string_value {

	static int boolStr(String s) {
		if(s.length() <3)
			return -1;
		int res = s.charAt(0);
		for(int i=1; i<s.length(); i+=2) {
			switch(s.charAt(i)) {
				case 'A' :
					res &= s.charAt(i+1)-'0';
					break;
				case 'B' :
					res |= s.charAt(i+1)-'0';
					break;
				case 'C' :
					res ^= s.charAt(i+1)-'0';
					break;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		String s = "1A0B1";
		System.out.println(boolStr(s));
	}

}

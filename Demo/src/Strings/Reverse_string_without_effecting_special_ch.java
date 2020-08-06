package Strings;

public class Reverse_string_without_effecting_special_ch {

	static String reverse(String str) {
		int l=0, r= str.length()-1;
		while(l<r) {
			if(!Character.isAlphabetic(str.charAt(l))) {
				l++;
			}
			else if(!Character.isAlphabetic(str.charAt(r))) {
				r--;
			}
			
			else {
				char temp = str.charAt(l);
				char next = str.charAt(r);
				str = str.substring(0, l)+ next + str.substring(l+1, r) + temp + str.substring(r+1);
				l++;
				r--;
			}
		}
		return str;
	}
	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		System.out.println("Input string : " +str);
		System.out.println(str.substring(0, 4) + 'x' + str.substring(5, 8));
		String out = reverse(str);
		System.out.println("Output string : " +out);
	}

}

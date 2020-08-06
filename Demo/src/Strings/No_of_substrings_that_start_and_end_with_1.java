package Strings;

public class No_of_substrings_that_start_and_end_with_1 {

	static void countSubStr(String str) {
		int m = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == '1')
				m++;
		}
		System.out.println((m*(m-1))/2);
	}
	public static void main(String[] args) {
		String str = "00100101";
		countSubStr(str);
	}

}

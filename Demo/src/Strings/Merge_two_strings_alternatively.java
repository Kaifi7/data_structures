package Strings;

public class Merge_two_strings_alternatively {

	static void merge(String s1, String s2) {
		String temp = "";
		int l1 = s1.length();
		int l2 = s2.length();
		int smaller = (l1>l2)?l2:l1;
		smaller = smaller*2;
		int i=0, j=0;
		boolean turn = true;
		while(smaller>0) {
			if(turn) {
				temp+=s1.charAt(i++);
			}
			else {
				temp+=s2.charAt(j++);
			}
			smaller--;
			turn = !turn;
		}
		if(l1>l2) {
			for(int k=i;k<s1.length();k++) {
				temp+=s1.charAt(k);
			}
		}
		else if (l1<l2) {
			for(int k=j; k<s2.length();k++) {
				temp+=s2.charAt(k);
			}
		}
		System.out.println(temp.substring(0, temp.length()));
	}
	static void merge2(String s1, String s2) {
		StringBuilder result = new StringBuilder();
		for(int i=0; i<s1.length() || i<s2.length(); i++) {
			if(i<s1.length())
				result.append(s1.charAt(i));
			if(i<s2.length())
				result.append(s2.charAt(i));
		}
		String result1= result.toString();
		System.out.println(result1.substring(0, result1.length()));
	}
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		merge(s1, s2);
		merge2(s1, s2);
	}

}

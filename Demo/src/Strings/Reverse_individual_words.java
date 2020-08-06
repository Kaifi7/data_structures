package Strings;

import java.util.Stack;

public class Reverse_individual_words {

	static void reverse(String s) {
		String temp ="";
		Stack<Character>st = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				st.push(s.charAt(i));
			}
			else {
				while(!st.isEmpty()) {
					char val = st.pop();
					temp+=val;
				}
				temp+=" ";
			}
		}
		System.out.println(st.size());
		while(st.size()>0) {
			char val = st.pop();
			temp+=val;
		}
		System.out.println(temp.substring(0, temp.length()));
	}
	public static void main(String[] args) {
		String s = "I love my Rinki Diiid";
		reverse(s);
	}

}

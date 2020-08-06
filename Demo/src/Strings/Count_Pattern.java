package Strings;

import java.util.Stack;

public class Count_Pattern {

	static void printPattern(String s) {
		char val = s.charAt(0);
		Stack<Character>st = new Stack<Character>();
		st.push(val);
		for(int i=1; i<s.length(); i++){
			if(st.peek() == s.charAt(i))
				st.push(s.charAt(i));
			else {
				int size = st.size();
				System.out.print(st.peek() + ""+size);
				st.clear();
				st.push(s.charAt(i));
			}
		}
		while(!st.isEmpty()) {
			System.out.print(st.peek() + "" + st.size());
			st.clear();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String a = "a";
		String b = "aa";
		String c = "aabbb";
		String d = "aabbbaa";
		printPattern(a);
		printPattern(b);
		printPattern(c);
		printPattern(d);
	}

}

package Strings;

import java.util.Stack;

public class DeleteConsecutiveElements {

	static void deleteCons(String s) {
		String temp = "";
		Stack<Character>q = new Stack<>();
		q.add(s.charAt(0));
		temp+=s.charAt(0);
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)!=q.peek()) {
				temp+=s.charAt(i);
				q.add(s.charAt(i));
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		String s = "aababbccd";
		deleteCons(s);
	}

}

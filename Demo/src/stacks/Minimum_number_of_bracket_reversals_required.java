package stacks;

import java.util.Stack;

public class Minimum_number_of_bracket_reversals_required {

	static int countMinReversals(String expr) {
		int len = expr.length();
		if(len%2!=0)
			return -1;
		Stack<Character>s =new Stack<>();
		for(int i=0; i<len; i++) {
			char c = expr.charAt(i);
			if(c=='}' && !s.empty()) {
				if(s.peek()=='{')
					s.pop();
				else
					s.push(c);
			}
			else
				s.push(c);
		}
		int red_len = s.size();
		int n=0;
		while(!s.empty() && s.peek() == '{') {
			s.pop();
			n++;
		}
		return (red_len/2 + n%2);
	}
	public static void main(String[] args) {
		 String expr = "}}{{"; 
	     System.out.println(countMinReversals(expr));
	}

}

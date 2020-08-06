package stacks;

import java.util.Stack;

public class Evaluate_postfix {

	static int evaluatePostfix(String exp) {
		Stack<Integer>s = new Stack<Integer>();
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(Character.isDigit(c)) {
				s.push(c-'0');
			}
			else {
				int val1 = s.pop();
				int val2 = s.pop();
				switch(c) {
					case '+':
						s.push(val2+val1);
						break;
					case '-':
						s.push(val2-val1);
						break;
					case '/':
						s.push(val2/val1);
						break;
					case '*':
						s.push(val2*val1);
						break;
				}
			}
		}
		return s.pop();
	}
	public static void main(String[] args) {
		String exp = "231*+9-";
		System.out.println("postfix evaluation : " +evaluatePostfix(exp));
	}

}

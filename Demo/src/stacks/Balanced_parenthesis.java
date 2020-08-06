package stacks;

public class Balanced_parenthesis {

	static class Stack {
		int top=-1;
		char items[] = new char[100];
		void push(char x) {
			if(top==99) {
				System.out.println("Stack full");
			}
			else {
				items[++top]=x;
			}
		}
		char pop() {
			if(top==-1) {
				System.out.println("Underflow error");
				return '\0';
			}
			else {
				char element = items[top];
				top--;
				return element;
			}
		}
		boolean isEmpty() {
			return(top == -1)?true:false;
		}
	}
	static boolean isMatchingPair(char char1, char char2) {
		if(char1 == '(' && char2 == ')')
			return true;
		else if(char1 == '{' && char2 == '}')
			return true;
		else if(char1 == '[' && char2 == ']')
			return true;
		else
			return false;
	}
	static boolean areParenthesisBalanced(char exp[]) {
		Stack st = new Stack();
		for(int i=0; i<exp.length; i++) {
			if(exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);
			if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
				if(st.isEmpty()) {
					return false;
				}
				else if(!isMatchingPair(st.pop(), exp[i])) {
					return false;
				}
			}
		}
		if(st.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		char exp[] = {'{','(',')','}','[',']'}; 
        if (areParenthesisBalanced(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");   
	}

}

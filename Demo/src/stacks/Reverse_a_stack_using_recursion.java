package stacks;

import java.util.Stack;

public class Reverse_a_stack_using_recursion {

	static Stack<Character>st = new Stack<>();
	static void reverse() {
		if(st.size() > 0) {
			char x = st.peek();
			st.pop();
			reverse();
			insert_at_bottom(x);
		}
	}
	static void insert_at_bottom(char x) {
		if(st.isEmpty())
			st.push(x);
		else {
			char a = st.peek();
			st.pop();
			insert_at_bottom(x);
			st.push(a);
		}
	}
	
	public static void main(String[] args) {
		st.push('1'); 
        st.push('2'); 
        st.push('3'); 
        st.push('4'); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(st); 
          
        // function to reverse  
        // the stack 
        reverse(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(st); 
	}

}

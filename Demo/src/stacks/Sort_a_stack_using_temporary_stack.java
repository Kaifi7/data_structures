package stacks;

import java.util.Stack;

public class Sort_a_stack_using_temporary_stack {

	public static Stack<Integer>sortStack(Stack<Integer>input){
		Stack<Integer>tmpStack = new Stack<Integer>();
		while(!input.isEmpty()) {
			int tmp = input.pop();
			while(!tmpStack.empty() && tmpStack.peek()>tmp) {
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
		}
		return tmpStack;
	}
	public static void main(String[] args) {
		Stack<Integer>input = new Stack<Integer>();
		input.add(34);
		input.add(3);
		input.add(31);
		input.add(98);
		input.add(92);
		input.add(23);
		Stack<Integer>tmpStack = sortStack(input);
		System.out.println("Sorted numbers are :");
		while(!tmpStack.empty()) {
			System.out.print(tmpStack.pop() + " ");
		}
	}

}

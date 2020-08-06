package stacks;

import java.util.Stack;

public class Queue_using_stacks {

	static class Queue{
		static Stack<Integer>s1 = new Stack<Integer>();
		static Stack<Integer>s2 = new Stack<Integer>();
		 void enQueue(int x) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(x);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		 int  deQueue() {
			if(s1.isEmpty()) {
				System.out.println("Q is empty");
			}
			int x = s1.peek();
			s1.pop();
			return x;
		}
		
	}
	/*static class Queue{
		Stack<Integer>s1 = new Stack<Integer>();
		Stack<Integer>s2 = new Stack<Integer>();
		void push (Stack<Integer>top_ref, int new_data) {
			top_ref.push(new_data);
		}
		int pop(Stack<Integer>top_ref) {
			if(top_ref.isEmpty()) {
				System.out.println("Stack underflow");
			}
			return top_ref.pop();
		}
		 void enQueue(Queue q, int x) {
			push(q.s1, x);
		}
		 int deQueue(Queue q) {
			 int x;
			 if(q.s1.isEmpty() && q.s2.isEmpty()) {
				 System.out.println("Q is empty");
			 }
			 if(q.s2.isEmpty()) {
				 while(!q.s1.isEmpty()) {
					 x = pop(q.s1);
					 push(q.s2, x);
				 }
			 }
			 x = pop(q.s2);
			 return x;
		 }
	}*/
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}

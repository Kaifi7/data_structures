package linked_list;

public class Implement_a_stack_using_singly_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node top;
	Implement_a_stack_using_singly_ll(){
		this.top= null;
	}
	static void push(int x) {
		Node temp = new Node(x);
		if(temp == null) {
			System.out.println("Heap Overflow");
			return;
		}
		temp.next = top;
		top = temp;
	}
	static boolean isEmpty() {
		return top==null;
	}
	static int peek() {
		if(!isEmpty())
			return top.data;
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	static void pop() {
		if(top==null) {
			System.out.println("Stack underflow");
			return;
		}
		top = top.next;
	}
	static void display() {
		if(top==null) {
			System.out.println("Stack underflow");
			return;
		}
		else {
			Node temp = top;
			while(temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {
		push(11); 
        push(22); 
        push(33); 
        push(44); 
  
        // print Stack elements 
        display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", peek()); 
  
        // Delete top element of Stack 
        pop(); 
        pop(); 
  
        // print Stack elements 
        display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", peek()); 
	}

}

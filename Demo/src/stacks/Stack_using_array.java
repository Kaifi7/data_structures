package stacks;

public class Stack_using_array {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty() {
		return (top<0);
	}
	
	Stack_using_array(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top>=MAX-1) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x + " pushed into the stack ");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek() {
			if(top<0) {
				System.out.println("Stack underflow");
				return 0;
			}
			else {
				int x = a[top];
				return x;
			}	
	}
	public static void main(String[] args) {
		Stack_using_array s = new Stack_using_array();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + "Popped from the stack");
		System.out.println("Top element of the stack : " +s.peek());
	}

}
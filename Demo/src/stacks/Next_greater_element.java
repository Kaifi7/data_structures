package stacks;
/*
public class Next_greater_element {

	static class Stack {
		int top;
		int items[] = new int[100];
		
		void push(int x) {
			if(top==99) {
				System.out.println("Stack full");
			}
			else {
				items[++top] = x;
			}
		}
		int pop() {
			if(top == -1) {
				System.out.println("Underflow error");
				return -1;
			}
			else {
				int element = items[top];
				top --;
				return element;
			}
		}
		boolean isEmpty() {
			return(top==-1)?true:false;
		}
	}
	static void printNGE(int arr[], int n) {
		int i =0;
		Stack s = new Stack();
		s.top=-1;
		int element,next;
		s.push(arr[0]);
		for(i=1; i<n; i++) {
			next = arr[i];
			if(s.isEmpty() == false) {
				element = s.pop();
				while(element < next) {
					System.out.println(element + " --> " +next);
					if(s.isEmpty())
						break;
					element = s.pop();
				}
				if(element > next)
					s.push(element);
			}
			s.push(next);
		}
		while(s.isEmpty() == false) {
			element = s.pop();
			next = -1;
			System.out.println(element + " --> " +next);
		}
	}
	public static void main(String[] args) {
		int arr[] = {11, 13, 21, 3};
		int n = arr.length;
		printNGE(arr, n);
	}

}*/
/*package whatever //do not write package name here */

import java.util.*;

class Next_greater_element {
	public static void main(String[] args) {
        System.out.println("Hello World!");
        /**
        4, 5, 2, 25, 13, 7, 6, 12
        5,4,3,2,1,6
        */
        int[] arr = {7,8,1,4};
        System.out.println(printNextGreater(arr));
    }
    
    private static LinkedList<Integer> printNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>(); // to maintain order
        for(int i=arr.length-1;i>-1;i--){
            
            while(!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }
            
            if(!stack.isEmpty()) {
                ll.addFirst(stack.peek());
            } else {
                ll.addFirst(-1);
            }
            stack.push(arr[i]);
        }
        return ll;
    }

}

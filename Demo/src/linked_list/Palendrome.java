package linked_list;

import java.util.Stack;

public class Palendrome {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void addNode(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static boolean checkPalendrome(Node node) {
		Node slow_ptr = head;
		Node fast_ptr = head;
		Stack<Integer> s = new Stack();
		while(node!=null && slow_ptr!=null && fast_ptr.next!=null) {
			s.push(slow_ptr.data);
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			
		}
		slow_ptr = slow_ptr.next;
		while(slow_ptr!=null) {
			int val = s.pop();
			System.out.println(val + " " + slow_ptr.data);
			if(val!= slow_ptr.data)
				return false;
			slow_ptr = slow_ptr.next;
		}
		return true;
	}
	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(3);
		addNode(2);
		addNode(1);
		printList(head);
		if(checkPalendrome(head))
			System.out.println("Is Palendrome");
		else
			System.out.println("Not a Palendrome");
	}

}

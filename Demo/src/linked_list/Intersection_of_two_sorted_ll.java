package linked_list;

import java.util.HashSet;
import java.util.Stack;

public class Intersection_of_two_sorted_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next =null;
		}
	}
	static Node head1, head2, head3;
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head3;
		head3 = new_node;
	}
	static Stack getIntersectedList(Node node1, Node node2) {
		HashSet<Integer>h = new HashSet<Integer>();
		Stack<Integer>s = new Stack<Integer>();
		while(node1!=null) {
			h.add(node1.data);
			node1= node1.next;
		}
		while(node2!=null) {
			if(h.contains(node2.data)) {
				s.push(node2.data);
			}
			node2 = node2.next;
		}
		return s;
	}
	
	public static void main(String[] args) {
		head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(6);
		printList(head1);
		
		head2 = new Node(2);
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		head2.next.next.next = new Node(8);
		printList(head2);
		
		Stack<Integer>st = new Stack<Integer>();
		st = getIntersectedList(head1, head2);
		while(!st.isEmpty()) {
			push(st.pop());
		}
		System.out.println("Intersected list is : ");
		printList(head3);
		
	}

}

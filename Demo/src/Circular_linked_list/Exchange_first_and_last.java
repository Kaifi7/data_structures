package Circular_linked_list;

import Circular_linked_list.Traversal.Node;

public class Exchange_first_and_last {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static void printList(Node node) {
		Node temp =node;
		if(node!=null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			while(temp!=node);
		}
		System.out.println();
	}
	static Node exchange(Node node) {
		Node p = head;
		while(p.next.next!=head) {
			p=p.next;
		}
			p.next.next = head.next;
			head.next=p.next;
			p.next  = head;
			head = head.next;
			return head;
	}
	public static void main(String[] args) {
		push(4);
		push(3);
		push(2);
		push(1);
		push(3);
		push(2);
		push(1);
		head.next.next.next.next.next.next.next = head;
		printList(head);
		head = exchange(head);
		printList(head);
	}

}

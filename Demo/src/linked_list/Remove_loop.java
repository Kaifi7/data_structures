package linked_list;

import java.util.HashSet;

public class Remove_loop {

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
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	static boolean removeLoop(Node h) {
		HashSet<Node>s = new HashSet<Node>();
		Node prev = null;
		while(h!=null) {
			if(s.contains(h)) {
				prev.next = null;
				return true;
			}
			else {
				s.add(h);
				prev = h;
				h = h.next;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		push(20);
		push(4);
		push(15);
		push(10);
		head.next.next.next.next = head;
		if(removeLoop(head)) {
			System.out.println("Linked list after removing loop");
			printList(head);
		}
		else
			System.out.println("No Loops found");
	}

}

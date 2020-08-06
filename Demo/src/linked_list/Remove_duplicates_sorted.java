package linked_list;

import java.util.HashSet;

import linked_list.Remove_loop.Node;

public class Remove_duplicates_sorted {

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
		System.out.println();
	}
	static void removeDuplicates() {
		/*Node curr = head;
	    while(curr!=null) {
	    	Node temp = curr;
	    	while(temp!=null && temp.data==curr.data) {
	    		temp = temp.next;
	    	}
	    	curr.next = temp;
	    	curr = curr.next;
	    }*/
		Node curr = head;
		Node prev = null;
		HashSet<Integer>h = new HashSet<Integer>();
		while(curr!=null) {
			if(h.contains(curr.data)) {
				prev.next = curr.next;
			}
			else {
				h.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
		
	}
	public static void main(String[] args) {
		push(20);
		push(13);
		push(13);
		push(11);
		push(11);
		push(11);
		System.out.println("Printing list before removing duplicates : ");
		printList(head);
		System.out.println("Printing list after removing duplicates : ");
		removeDuplicates();
		printList(head);
	}

}

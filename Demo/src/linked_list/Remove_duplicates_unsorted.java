package linked_list;

import java.util.HashSet;

public class Remove_duplicates_unsorted {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static void removeDuplicates(Node node) {
		HashSet<Integer>h = new HashSet<>();
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			if(h.contains(curr.data)) {
				prev.next= curr.next;
			}
			else {
				h.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(12);
		head.next.next = new Node(11);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(12);
		head.next.next.next.next.next = new Node(10);
		System.out.println("Linked list before removing duplicates :");
		printList(head);
		System.out.println("Linked list after removing duplicates : ");
		removeDuplicates(head);
		printList(head);
	}

}

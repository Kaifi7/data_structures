package Circular_linked_list;

import java.util.HashSet;

public class Intersection_point_of_ll {
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1;
	static Node head2;
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static int findIntersection(Node node1, Node node2) {
		HashSet<Integer>h = new HashSet<Integer>();
		while(node1!=null) {
			h.add(node1.data);
			node1 = node1.next;
		}
		while(node2!=null) {
			if(h.contains(node2.data)) {
				return node2.data;
			}
			else {
				node2 = node2.next;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		head1.next.next.next.next.next.next = new Node(7);
		printList(head1);
		
		head2 = new Node(10);
		head2.next = new Node(9);
		head2.next.next = new Node(8);
		head2.next.next.next = head1.next.next.next;
		printList(head2);
		System.out.println(findIntersection(head1, head2));
	}

}

package linked_list;

import java.util.HashMap;

public class Intersection_of_two_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2, head3;
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static void intersect(Node node1, Node node2) {
		HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
		int i=0;
		Node temp = node1;
		while(temp!=null) {
			hm.put(i++, temp.data);
			temp = temp.next;
		}
		temp = node2;
		Node curr =null;
		while(temp!=null) {
			if(hm.containsValue(temp.data)) {
				Node new_node = new Node(temp.data);
				if(curr==null) {
					head3 = new_node;
					curr = new_node;
				}
				else {
					curr.next = new_node;
					curr = new_node;
				}
			}
			temp = temp.next;
		}
		
	}
	public static void main(String[] args) {
		head1 = new Node(8);
		head1.next = new Node(4);
		head1.next.next = new Node(15);
		head1.next.next.next = new Node(10);
		
		head2 = new Node(10);
		head2.next = new Node(2);
		head2.next.next = new Node(4);
		head2.next.next.next = new Node(8);
		
		System.out.println("First list is : ");
		printList(head1);
		System.out.println("Second list is : ");
		printList(head2);
		intersect(head1, head2);
		System.out.println("Intersected list is ");
		
		printList(head3);
	}

}

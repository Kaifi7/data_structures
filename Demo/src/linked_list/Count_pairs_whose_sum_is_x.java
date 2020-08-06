package linked_list;

import java.util.HashMap;

public class Count_pairs_whose_sum_is_x {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1,head2;
	static int count = 0;
	static void printList(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static int countPairs(Node node1, Node node2, int z) {
		Node temp = node1;
		HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
		int i=0;
		while(temp!=null) {
			hm.put(i++, temp.data);
			temp = temp.next;
		}
		temp = node2;
		while(temp!=null) {
			if(hm.containsValue(z-temp.data))
				count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		head1 = new Node(3);
		head1.next = new Node(1);
		head1.next.next = new Node(6);
		head1.next.next.next = new Node(7);
		
		head2 = new Node(8);
		head2.next = new Node(2);
		head2.next.next = new Node(5);
		head2.next.next.next = new Node(1);
		
		int x = 8;
		System.out.println("first linked list : ");
		printList(head1);
		System.out.println("second linked list : ");
		printList(head2);
		System.out.println("count is : " +countPairs(head1,head2, x));
	}

}

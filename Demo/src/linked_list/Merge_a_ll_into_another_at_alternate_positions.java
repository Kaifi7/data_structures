package linked_list;

public class Merge_a_ll_into_another_at_alternate_positions {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2;
	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head_ref;
		head_ref =  new_node;
		return head_ref;
	}
	static void printList(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static void merge(Node head1, Node head2) {
		Node after = null;
		Node node1 = head1; Node node2 = head2; Node other = null;
		while(node1!= null && node2!=null) {
			after = node1.next;
			other = node2.next;
			node1.next = node2;
			//head2 = node2.next;
			other = node2.next;
			node2.next = after;
			System.out.println("@ " +node2.data + " " + other.data);
			head2 = other;
			node1 = node1.next.next;
			node2 = other;
		}
	}
	public static void main(String[] args) {
		head1 = push(head1, 3);
		head1 = push(head1, 2);
		head1 = push(head1, 1);
		
		head2 = push(head2, 8);
		head2 = push(head2, 7);
		head2 = push(head2, 6);
		head2 = push(head2, 5);
		head2 = push(head2, 4);
		
		System.out.println("First linked list : ");
		printList(head1);
		System.out.println("second linked list : ");
		printList(head2);
		merge(head1, head2);
		System.out.println("Modified  first linked list :");
		printList(head1);
		System.out.println("Modified second linked list : ");
		printList(head2);
	}

}

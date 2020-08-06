package linked_list;

public class Reverse_a_ll_in_groups {

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
	static void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node reverse(Node head, int k) {
		Node current = head;
		Node next = null;
		Node prev = null;
		int count = 0;
		while(count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null) {
			head.next = reverse(next, k);
		}
		return prev;
	}
	public static void main(String[] args) {
		push(9);
		push(8);
		push(7);
		push(6);
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		System.out.println("given linked list ");
		printList();
		System.out.println("Reversed linked list : ");
		head = reverse(head, 3);
		printList();
	}

}

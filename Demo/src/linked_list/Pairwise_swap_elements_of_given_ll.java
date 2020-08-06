package linked_list;

public class Pairwise_swap_elements_of_given_ll {

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
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static void swapAlternate() {
		Node temp = head;
		while(temp!=null && temp.next!=null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}
	public static void main(String[] args) {
		push(7);
		push(6);
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		System.out.println("Print the list before swapping : ");
		printList();
		System.out.println("Print the list after swapping : ");
		swapAlternate();
		printList();
	}

}

package linked_list;

public class Insert_in_ll {

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
	static void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	static void append(int new_data) {
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = null;
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		append(6);
		push(7);
		push(1);
		append(4);
		insertAfter(head.next, 8);
		System.out.println("Created linked list is : ");
		printList();
	}

}

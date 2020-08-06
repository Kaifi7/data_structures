package doubly_linked_list;

public class Insertion_in_dll {

	static class Node{
		int data;
		Node next, prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	static Node head;
	//adding a node to the front of ll
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	static void insertAfter(Node node, int new_data) {
		if(node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = node.next;
		node.next = new_node;
		new_node.prev = node;
		if(new_node.next!=null)
			new_node.next.prev = new_node;
	}
	static void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		Node last = head;
		new_node.next = null;
		while(last.next!=null) {
			last = last.next;
		}
		new_node.prev = last;
		last.next = new_node;
	}
	static void printList(Node node) {
		Node last = null;
		System.out.println("Traversal in forward direction : ");
		while(node!=null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction : ");
		while(last!=null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}
	public static void main(String[] args) {
		append(6);
		push(7);
		push(1);
		append(4);
		insertAfter(head.next, 8);
		//insertAfter(head.next.next.next, 9);
		System.out.println("Created DLL is : ");
		printList(head);
	}

}

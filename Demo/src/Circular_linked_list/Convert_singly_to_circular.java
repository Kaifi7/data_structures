package Circular_linked_list;

public class Convert_singly_to_circular {

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
	static void convert(Node node) {
		Node temp = node;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	public static void main(String[] args) {
		push(4);
		push(3);
		push(2);
		push(1);
	}

}

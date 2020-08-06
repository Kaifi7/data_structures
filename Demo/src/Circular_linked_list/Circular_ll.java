package Circular_linked_list;

public class Circular_ll {

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
	static boolean checkCircular(Node node) {
		if(node == null)
			return true;
		Node temp = node;
		while(temp.next!=null) {
			if(temp.next == node)
				return true;
			temp = temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		push(4);
		push(3);
		push(2);
		push(1);
		head.next.next.next.next = head;
		if(checkCircular(head)) {
			System.out.println("Linked list is circular");
		}
		else
			System.out.println("Linked list is not circular");
	}

}

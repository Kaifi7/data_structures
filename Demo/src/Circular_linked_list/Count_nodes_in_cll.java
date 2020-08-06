package Circular_linked_list;

public class Count_nodes_in_cll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static int count =1;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static int countNodes(Node node) {
		if(node == null)
			return 0;
		Node temp = node;
		while(temp.next!=node) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		push(4);
		push(3);
		push(2);
		push(1);
		push(3);
		push(2);
		push(1);
		head.next.next.next.next.next.next.next = head;
		System.out.println(countNodes(head));
	}
}

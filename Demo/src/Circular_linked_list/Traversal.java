package Circular_linked_list;

public class Traversal {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void printList(Node head) {
		Node temp = head;
		if(head!=null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			while(temp!=head);
		}
	}
	static Node push(Node node, int data) {
		Node curr = node;
		Node temp = new Node(data);
		temp.next=node;
		if(node!=null) {
			while(curr.next!=node) {
				curr = curr.next;
			}
			curr.next = temp;
		}
		else {
			temp.next = temp;
			node = temp;
		}
		return node;
	}
	public static void main(String[] args) {
		head = null;
		head = push(head, 12);
		head = push(head, 56);
		head = push(head, 2);
		head = push(head, 11);
		System.out.println("Contents of circular linked list : ");
		printList(head);
	}

}

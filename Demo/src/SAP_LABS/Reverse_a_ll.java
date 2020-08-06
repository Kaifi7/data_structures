package SAP_LABS;

public class Reverse_a_ll {

	static class Node{
		int data;
		Node next;
		Node(int key){
			data = key;
			next = null;
		}
	}
	static Node head;
	static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node reverse(Node node) {
		Node curr = head;
		Node prev=null;
		Node after = null;
		while(curr!=null) {
			after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		node = prev;
		return node;
	}
	public static void main(String[] args) {
		head = new Node(85);
		head.next = new Node(15);
		head.next.next = new Node(4);
		head.next.next.next = new Node(20);
		System.out.println("Given linked list : ");
		printList();
		head = reverse(head);
		printList();
	}

}

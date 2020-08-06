package linked_list;
//time complexity is O(n)
public class LinkedList {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head, n;
	static void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		third.next =null;
		printList();
	}

}

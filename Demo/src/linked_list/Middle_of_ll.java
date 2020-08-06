package linked_list;

public class Middle_of_ll {

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
		Node tNode = head;
		while(tNode!=null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}
	static void printMiddle() {
		Node slowPtr = head;
		Node fastPtr = head;
		if(head!=null) {
			while(fastPtr!=null && fastPtr.next!=null) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
		}
		
		System.out.println("Middle of linked list is : " +slowPtr.data);
	}
	public static void main(String[] args) {
		for(int i=5; i>=0; i--) {
			push(i);
			printList();
			printMiddle();
		}
	}

}

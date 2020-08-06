package linked_list;

public class Rotate_ll_by_k {

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
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node after = null;
	static Node prev;
	static void rotate(int k) {
		if(k==0)
			return;
		Node temp = head;
		int count = 1;
		while(temp!=null ) {
			if(count == k) {
				after = temp;
			}
			count++;
			prev = temp;
			temp = temp.next;
		}	
		if(count<=k)
			return;
		prev.next = head;
		head = after.next;
		after.next = null;
	}
	public static void main(String[] args) {
		push(60);
		push(50);
		push(40);
		push(30);
		push(20);
		push(10);
		System.out.println("Given list : ");
		printList();
		rotate(8);
		System.out.println("Roated linked list : ");
		printList();
	}

}

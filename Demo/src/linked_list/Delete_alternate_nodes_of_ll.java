package linked_list;

public class Delete_alternate_nodes_of_ll {

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
	static void deleteAlt() {
		if(head == null)
			return;
		Node prev = head;
		Node now = head.next;
		while(prev!=null && now!=null) {
			prev.next = now.next;
			now = null;
			prev = prev.next;
			if(prev!=null)
				now = prev.next;
		}
	}
	public static void main(String[] args) {
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		System.out.println("Linked list before calling deleteAlt() ");
		printList();
		deleteAlt();
		System.out.println("Linked list after calling deleteAlt()");
		printList();
	}

}

package linked_list;

public class Delete_middle_of_ll {

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
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static void deleteMiddle(Node node) {
		Node slow_ptr = node;
		Node fast_ptr = node;
		Node prev = null;
		
		while(node!=null && slow_ptr!=null && fast_ptr.next!=null) {
			prev = slow_ptr;
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		prev.next = slow_ptr.next;
		
	}
	public static void main(String[] args) {
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		System.out.println("List before removing middle element");
		printList(head);
		System.out.println("List after removing middle element");
		deleteMiddle(head);
		printList(head);
	}

}

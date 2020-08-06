package doubly_linked_list;

public class reverse_a_dll {

	static class Node{
		int data;
		Node next, prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	static Node head;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static Node temp = null;
	static Node after = null;
	static Node curr;
	static void reverse(Node node) {
		curr = head;
		while(curr!=null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		if(temp!=null) {
			head = temp.prev;
		}
	}
	public static void main(String[] args) {
		push(2);
		push(4);
		push(8);
		push(10);
		System.out.println("Original linked list is : ");
		printList(head);
		System.out.println(" ");
		System.out.println("The reversed linked list is : ");
		reverse(head);
		printList(head);
	}

}

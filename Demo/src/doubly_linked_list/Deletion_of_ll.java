package doubly_linked_list;

public class Deletion_of_ll {

	static class Node{
		int data;
		Node next, prev;
		Node(int d){
			data = d;
			next = prev = null;
		}
	}
	static Node head;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null)
			head.prev = new_node;
		head = new_node;
	}
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static void delete(Node head_ref, Node del) {
		if(head == null || del == null) {
			return;
		}
		if(head == del) {
			head = del.next;
		}
		if(del.next !=null) { 
			del.next.prev = del.prev;
		}
		if(del.prev!=null) {
			del.prev.next = del.next;
		}
		return;
	}
	public static void main(String[] args) {
		push(2);
		push(4);
		push(8);
		push(10);
		System.out.println("Created DLL IS : ");
		printList(head);
		delete(head, head);
		System.out.println("\nList after deleting first node : ");
		printList(head);
		delete(head, head.next);
		System.out.println("\n List after deleting node 4 : ");
		printList(head);
	}

}

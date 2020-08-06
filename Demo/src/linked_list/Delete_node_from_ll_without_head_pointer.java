package linked_list;

public class Delete_node_from_ll_without_head_pointer {

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
		while(temp!=null) {
			System.out.print(temp.data +  " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node after;
	static void deleteNode(Node node) {
		Node curr = node;
		if(curr.next==null) {
			curr = null;
			return;
		}
		if(curr!=null && curr.next!=null) {
			after = node.next;
			curr.data = after.data;
			curr.next = after.next;
		}
	}
	public static void main(String[] args) {
		push(20);
		push(4);
		push(15);
		push(35);
		System.out.println("Linked list is : ");
		printList();
		Node del = head.next.next;
		System.out.println("Linked list after deletion is : ");
		deleteNode(del);
		printList();
	}

}

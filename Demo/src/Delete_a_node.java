
public class Delete_a_node {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void printList(Node node) {
		Node current = node;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static void deleteNode(Node node, Node n) {
		if(node == n) {
			if(node.next == null) {
				System.out.println("There is only one node. List can't be empty");
				return;
			}
		}
		Node current = node;
		while(current != null) {
			if(current.next == n) {
				Node after = current.next.next;
				current.next = after;
				return;
			}
			current = current.next;
		}
	}
	public static void main(String[] args) {
		push(3);
		push(2);
		push(6);
		push(5);
		push(11);
		push(10);
		push(15);
		push(12);
		printList(head);
		System.out.println("After deletion : ");
		deleteNode(head, head.next.next);
		printList(head);
	}

}

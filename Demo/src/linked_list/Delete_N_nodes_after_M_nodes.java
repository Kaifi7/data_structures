package linked_list;

public class Delete_N_nodes_after_M_nodes {

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
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node prev;
	static void skipMdeleteN(Node node, int m, int n) {
		Node temp = node;
		
		while(temp!=null) {
			for(int i=0; i<m; i++) {
				prev = temp;
				if(temp!=null)
				temp = temp.next;
			}
			for(int i=0; i<n; i++) {
				if(temp!=null)
				temp = temp.next;
			}
			prev.next = temp;
		}
	}
	public static void main(String[] args) {
		push(10);
		push(9);
		push(8);
		push(7);
		push(6);
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		int M = 3, N = 2;
		System.out.println("Given linked list is : ");
		printList();
		skipMdeleteN(head, M, N);
		System.out.println("Linked list after deletion is : ");
		printList();
	}

}

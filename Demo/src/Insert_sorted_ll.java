
public class Insert_sorted_ll {

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
	static Node after = null, prev=null;
	static void insert(Node node, int num) {
		if(node!= null && node.data > num) {
			Node temp = new Node(num);
			temp.next = head;
			head = temp;
			return;
		}	
		while(node!=null) {
			if( node.next!=null && node.data < num && node.next.data > num) {
				Node new_node = new Node(num);
				after = node.next;
				node.next = new_node;
				new_node.next = after;
				return;
			}
			prev = node;
			node = node.next;
		}
		if(node == null && prev!=null && prev.data < num) {
			Node new_node = new Node(num);
			prev.next = new_node;
			new_node.next = null;
		}
	}
	public static void main(String[] args) {
		push(10);
		push(7);
		push(5);
		push(3);
		push(1);
		System.out.println("Linked list before inserting : ");
		printList(head);
		int x=0;
		System.out.println("Linked list after inserting "+x);
		insert(head, x);
		printList(head);
	}

}

package linked_list;

public class Insert_in_a_sorted_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static Node prev ;
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
	static void insert(Node node, int num) {
		if(node == null || node.data>=num) {
			Node temp = new Node(num);
			temp.next = head;
			head = temp;
			return;
		}
		
		while(node!=null) {
			if(node.data<=num &&  node.next!=null && node.next.data>=num) {
				Node temp = new Node(num);
				temp.next = node.next;
				node.next = temp;
				return;
			}
			prev = node;
			node = node.next;
		}
		if(num>prev.data) {
			Node temp = new Node(num);
			prev.next = temp;
			temp.next = null;
		}
	}
	public static void main(String[] args) {
		push(10);
		push(7);
		push(5);
		push(3);
		push(1);
		System.out.println("Linked list before inserting : ");
		printList();
		int x=0;
		System.out.println("Linked list after inserting "+x);
		insert(head, x);
		printList();
	}

}

package linked_list;

public class Sort_ll_on_already_sorted_absolute_values {

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
	static Node sortedList(Node head) {
		Node prev = head;
		Node curr = head.next;
		while(curr!=null) {
			if(curr.data < prev.data) {
				prev.next = curr.next;
				curr.next = head;
				head = curr;
				curr = prev;
			}
			else
				prev = curr;
			curr = curr.next;
		}
		return head;
	}
	public static void main(String[] args) {
		push(-5);
		push(5);
		push(4);
		push(3);
		push(-2);
		push(1);
		push(0);
		System.out.println("Original linked list is : ");
		printList();
		System.out.println("sorted linked list is : ");
		head = sortedList(head);
		printList();
	}

}

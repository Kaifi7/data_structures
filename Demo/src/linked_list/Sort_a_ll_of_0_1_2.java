package linked_list;

public class Sort_a_ll_of_0_1_2 {

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
	static void sortList() {
		int count[] = {0, 0, 0};
		Node ptr = head;
		while(ptr!=null) {
			count[ptr.data]++;
			ptr =ptr.next;
		}
		int i=0;
		ptr = head;
		while(ptr!=null) {
			if(count[i] == 0)
				i++;
			else {
				ptr.data = i;
				count[i]--;
				ptr = ptr.next;
			}
		}
	}
	public static void main(String[] args) {
		push(0);
		push(1);
		push(0);
		push(2);
		push(1);
		push(1);
		push(2);
		push(1);
		push(2);
		System.out.println("Linked list before sorting : ");
		printList();
		sortList();
		System.out.println("Linked list after sorting : ");
		printList();
	}

}

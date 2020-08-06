package linked_list;

public class Rearrange_a_ll_in_zigzag {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static int temp = 0;
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
	static void zigZagList(Node head) {
		boolean flag = true;
		Node current = head;
		while(current!=null && current.next!=null) {
			if(flag == true) {
				if(current.data > current.next.data) {
					temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
				}
			}
			else {
				if(current.data < current.next.data) {
					temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
				}
			}
			current = current.next;
			flag = !(flag);
		}
	}
	public static void main(String[] args) {
		push(1);  
	    push(2);  
	    push(6);  
	    push(8);  
	    push( 7);  
	    push( 3);  
	    push( 4);  
	  
	    System.out.println("Given linked list ");  
	    printList(head);  
	    zigZagList(head);  
	    System.out.println("Zig Zag Linked list ");  
	    printList(head);  
	}

}

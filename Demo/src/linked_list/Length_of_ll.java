package linked_list;

public class Length_of_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static int count =0;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static int getCount() {
		/*
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;*/
		return getCountUtil(head);
	}
	static int getCountUtil(Node node) {
		if(node== null)
			return 0;
		else
			return 1 + (getCountUtil(node.next));
	}
	public static void main(String[] args) {
		push(1);
		push(3);
		push(1);
		push(2);
		push(1);
		System.out.println("Length of linked list is : " +getCount());
	}
	
}

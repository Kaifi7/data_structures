package linked_list;

public class No_of_times_element {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static int count = 0;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static int countElement(Node node, int num) {
		if(node==null)
			return 0;
		if(node.data == num)
			return 1 + countElement(node.next, num);
		return countElement(node.next, num);
	}
	public static void main(String[] args) {
		push(1);
		push(2);
		push(1);
		push(3);
		push(1);
		push(1);
		push(1);
		push(1);
		System.out.println(countElement(head, 5));
	}

}

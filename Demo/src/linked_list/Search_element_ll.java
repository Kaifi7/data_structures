package linked_list;

public class Search_element_ll {

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
	static boolean search(Node node, int value) {
		/*
		while(node!=null) {
			if(node.data == value)
				return true;
			node = node.next;
		}
		return false;*/
		if(node==null)
			return false;
		if(node.data==value)
			return true;
		return search(node.next, value);
	}
	public static void main(String[] args) {
		push(10);
		push(30);
		push(11);
		push(21);
		push(14);
		if(search(head, 21))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

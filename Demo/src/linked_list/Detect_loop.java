package linked_list;

import java.util.Hashtable;
import java.util.Map;

public class Detect_loop {

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
	static int key=0;
	static boolean detectLoop(Node node) {
		Map<Integer, Integer> ht = new Hashtable<>();
		while(node.next!=null) {
			if(ht.containsValue(node.data))
				return true;
			ht.put(++key, node.data);
			node = node.next;
		}
		return false;
	}
	public static void main(String[] args) {
		push(20);
		push(4);
		push(15);
		push(10);
		head.next.next.next.next = head;
		if(detectLoop(head))
			System.out.println("Loop Found");
		else
			System.out.println("No Loop");
	}

}

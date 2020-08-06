package linked_list;

import java.util.HashMap;

public class DetectAndRemoveLoopInLL {

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
		new_node.next= head;
		head = new_node;
	}
	static HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
	static int key=0;
	static Node prev = null;
	static boolean checkLoop(Node node) {
		while(node!=null) {
			if(map.containsValue(node.data)) {
				prev.next = null;
				return true;
			}
			map.put(++key, node.data);
			prev =node;
			node = node.next;
		}
		return false;
	}
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		push(20);
		push(4);
		push(15);
		push(10);
		head.next.next.next.next = head;
		if(checkLoop(head))
			System.out.println("Loop Found");
		else
			System.out.println("No Loop");
	}

}

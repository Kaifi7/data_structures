package linked_list;

import linked_list.Length_of_loop_ll.Node;

public class len_of_loop_ll {

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
	static Node newNode(int key) {
		Node temp = new Node(key);
		return temp;
	}
	static void print(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	static int countNodesinLoop(Node node) {
		Node slow = node, fast = node;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return countNodes(slow);
			}
		}
		return 0;
	}
	static int count = 1;
	static int countNodes(Node node) {
		Node temp = node;
		while(temp.next!=node) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		head = new Node(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(5);
		head.next.next.next.next.next = head.next;
		System.out.println(countNodesinLoop(head));
	}

}

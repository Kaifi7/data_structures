package linked_list;

public class Nth_node_from_end_ll {

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
	static int count = 0;
	static int length() {
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	static int counter =0;
	static int NthNode(int n) {
		int val = length() - n;
		Node temp = head;
		while(temp != null) {
			if(counter == val) {
				return temp.data;
			}
			else {
				counter++;
				temp = temp.next;
			}
		}
		return -1;
	}
	static void NthFromLast(int n) {
		Node main_ptr = head;
		Node ref_ptr = head;
		int count =0;
		if(head != null) {
			while(count < n) {
				if(ref_ptr == null) {
					System.out.println(n + " is greater than the no of nodes in the list");
					return;
				}

				ref_ptr = ref_ptr.next;
				count++;
			}
			while(ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println("Node no " +n+ " from last is " +main_ptr.data);
		}
	}
	public static void main(String[] args) {
		push(20);
		push(4);
		push(15);
		push(35);
		System.out.println(NthNode(4));
	}

}

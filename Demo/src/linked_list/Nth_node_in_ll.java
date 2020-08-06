package linked_list;
//	Time complexity is O(n)
public class Nth_node_in_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static Node push(Node head, int new_data) {
		Node new_node = new Node(new_data);
		new_node.data = new_data;
		new_node.next = head;
		head = new_node;
		return head;
	}
	static int getNth(Node head, int n) {
		Node current = head;
		int count =0;
		while(current!=null) {
			if(count==n) {
				return current.data;
			}
			else {
				count++;
				current = current.next;
			}
		}
		assert(false);
		return 0;
	}
	
	public static void main(String[] args) {
		head = push(head, 1);
		head = push(head, 4);
		head = push(head, 1);
		head = push(head, 12);
		head = push(head, 1);
		System.out.println(getNth(head, 3));
	}

}

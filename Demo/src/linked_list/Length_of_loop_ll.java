package linked_list;

public class Length_of_loop_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static Node newNode(int key) {
		Node temp = new Node(key);
		return temp;
	}
	static int countNodesinLoop(Node list) {
		Node slow_ptr = list, fast_ptr = list;
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr) {
				return countNodes(slow_ptr);
			}
		}
		return 0;
	}
	static int countNodes(Node n) {
		int res = 1;
		Node temp = n;	
		while(temp.next!=n) {
			res++;
			temp = temp.next;
		}
		return res;
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

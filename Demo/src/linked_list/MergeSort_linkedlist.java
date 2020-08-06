package linked_list;

public class MergeSort_linkedlist {

	static class Node{
		Node next;
		int data;
		Node(int val){
			data = val;
			next = null;
		}
	}
	static Node head =null;
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static Node mergeSort(Node h) {
		if(h == null || h.next == null) {
			return h;
		}
		Node middle = getMiddle(h);
		Node nextMiddle = middle.next;
		middle.next = null;
		
		Node left = mergeSort(h);
		Node right = mergeSort(nextMiddle);
		Node sortedList = sortedMerge(left, right);
		return sortedList;
	}
	static Node getMiddle(Node head) {
		if(head == null)
			return head;
		Node slow=head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	static Node sortedMerge(Node a, Node b) {
		Node result = null;
		if(a == null)
			return b;
		if(b == null)
			return a;
		
		if(a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next,b);
		}
		else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	public static void main(String[] args) {
	        push(15); 
	        push(10); 
	        push(5); 
	        push(20); 
	        push(3); 
	        push(2); 
	        head = mergeSort(head);
	        System.out.print("Sorted Linked List is: \n"); 
	        printList(head);
	}

}

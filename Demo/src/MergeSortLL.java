
public class MergeSortLL {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static Node mergeSort(Node h) {
		if(h == null || h.next == null)
			return h;
		Node middle = getMiddle(h);
		Node middleNext = middle.next;
		middle.next = null;
		Node left = mergeSort(h);
		Node right = mergeSort(middleNext);
		Node sortedList =sortedMerge(left, right);
		return sortedList;
	}
	static Node sortedMerge(Node a, Node b) {
		Node result = null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next, b);
		}
		else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	static Node getMiddle(Node node) {
		Node slow_ptr = node, fast_ptr = node;
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null && fast_ptr.next.next!=null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		return slow_ptr;
	}
	public static void main(String[] args) {
		push(15); 
        push(10); 
        push(5); 
        push(20); 
        push(3); 
        push(2); 
        printList(head);
        head = mergeSort(head);
        System.out.print("Sorted Linked List is: \n"); 
        printList(head);
	}

}

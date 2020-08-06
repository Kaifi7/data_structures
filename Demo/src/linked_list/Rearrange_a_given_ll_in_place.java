package linked_list;

public class Rearrange_a_given_ll_in_place {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	
	static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node findMiddle(Node node) {
		Node slow = node, fast = node;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	static Node reverseList(Node node) {
		Node temp = node;
		Node prev =null;
		Node after = null;
		while(temp!=null) {
			after = temp.next;
			temp.next = prev;
			prev = temp;
			temp = after;
		}
		return prev;
	}
	static Node rearrange(Node node) {
		Node middle = findMiddle(node);
		System.out.println(middle.data);
		Node node1 = node;
		Node node2 = middle.next;
		middle.next = null;
		node2 = reverseList(node2);
		System.out.println(node1.data + " " +node2.data);
		Node temp = new Node(0);
		Node curr = temp;
		while(node1!=null || node2!=null) {
			if(node1!=null) {
				curr.next = node1;
				curr = curr.next;
				node1 = node1.next;
			}
			if(node2!=null) {
				curr.next = node2;
				curr = curr.next;
				node2 = node2.next;
			}
		}
		node = temp.next;
		return node;
	}
	public static void main(String[] args) {
        head = new Node(1); 
        head.next = new Node(2); 
        head.next.next = new Node(3); 
        head.next.next.next = new Node(4); 
        head.next.next.next.next = new Node(5); 
  
        printList(); // print original list 
        head = rearrange(head); // rearrange list as per ques 
        printList(); // print modified list 
	}

}

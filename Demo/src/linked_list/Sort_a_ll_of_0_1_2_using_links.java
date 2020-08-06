package linked_list;

public class Sort_a_ll_of_0_1_2_using_links {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void printList(Node temp) {
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node sortList(Node head) {
			if(head == null || head.next == null) {
				return head;
			}
			Node zeroD = new Node(0);
			Node oneD = new Node(0);
			Node twoD = new Node(0);
			Node zero = zeroD, one = oneD, two = twoD;
			Node curr = head;
			while(curr!=null) {
				if(curr.data == 0) {
					zero.next = curr;
					zero =zero.next;
					curr = curr.next;
				}
				else if(curr.data == 1) {
					one.next = curr;
					one = one.next;
					curr = curr.next;
				}
				else {
					two.next = curr;
					two = two.next;
					curr = curr.next;
				}
			}
			zero.next = (oneD.next!=null)?(oneD.next) : (twoD.next);
			one.next = twoD.next;
			two.next = null;
			head = zeroD.next;
			return head;
	}		
	public static void main(String[] args) {
	
		head = new Node(1);
		head.next = new Node(0);
		head.next.next = new Node(2);
		head.next.next.next= new Node(1);
		System.out.println("Linked list before sorting : ");
		printList(head);
		System.out.println("Linked list after sorting : ");
		head = sortList(head);
		printList(head);
	}

}

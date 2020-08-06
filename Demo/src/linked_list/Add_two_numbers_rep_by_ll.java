package linked_list;

public class Add_two_numbers_rep_by_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2;
	static void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node addTwoLists(Node first, Node second) {
		Node res = null;
		Node prev = null;
		Node temp = null;
		int carry = 0, sum;
		while(first!=null || second!=null) {
			sum = carry + (first!=null?first.data:0) + (second!=null?second.data:0);
			carry = (sum >= 10)?1:0;
			sum = sum % 10;
			temp = new Node(sum);
			if(res == null) {
				res = temp;
			}
			else {
				prev.next = temp;
			}
			prev = temp;
			if(first!=null) {
				first = first.next;
			}
			if(second!=null) {
				second = second.next;
			}
		}
		if(carry > 0) {
			temp.next = new Node(carry);
		}
		return res;
	}
	public static void main(String[] args) {
		head1 = new Node(7);
		head1.next = new Node(5);
		head1.next.next = new Node(9);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(6);
		System.out.println("First List is : ");
		printList(head1);
		
		head2 = new Node(8);
		head2.next = new Node(0);
		head2.next.next = new Node(0);
		System.out.println("Second list is : ");
		printList(head2);
		
		Node rs = addTwoLists(head1, head2); 
        System.out.print("Resultant List is "); 
        printList(rs);
	}

}

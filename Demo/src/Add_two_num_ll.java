
public class Add_two_num_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2;
	static void printList(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data  + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node reverse(Node node) {
		Node curr = node;
		Node prev = null, after = null;
		while(curr!=null) {
			after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		node = prev;
		return node;
	}
	static Node addTwoLists(Node node1, Node node2) {
		Node n1 = reverse(node1);
		Node n2 = reverse(node2);
		int carry=0, sum;
		Node temp = null;
		Node prev = null;
		Node res = null;
		while(n1!=null || n2!=null) {
			sum = carry + (n1!=null ? n1.data:0) + (n2!=null ? n2.data:0);
			carry = (sum>=10)?1:0;
			sum = sum%10;
			temp = new Node(sum);
			if(res==null) {
				res = temp;
			}
			else {
				prev.next = temp;
			}
			prev = temp;
			if(n1!=null) {
				n1 = n1.next;
			}
			if(n2!=null) {
				n2 = n2.next;
			}
		}
		if(carry>0) {
			temp.next = new Node(carry);
		}
		return reverse(res);
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
		head2.next = new Node(1);
		head2.next.next = new Node(2);
		System.out.println("Second list is : ");
		printList(head2);
		
		Node rs = addTwoLists(head1, head2); 
        System.out.print("Resultant List is "); 
        printList(rs);
	}

}

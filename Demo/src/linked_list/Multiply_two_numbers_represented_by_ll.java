package linked_list;

public class Multiply_two_numbers_represented_by_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2;
	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head_ref;
		head_ref = new_node;
		return head_ref;
	}
	static void printList(Node node) {
		Node temp = node;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static int multiplyTwoLists(Node node1,Node node2) {
		int num1 = 0, num2 = 0;
		while(node1!=null || node2!=null) {
			if(node1!=null) {
				num1 = num1*10 + node1.data;
				node1 = node1.next;
			}
			if(node2!=null) {
				num2 = num2*10 + node2.data;
				node2 = node2.next;
			}
		}
		return num1*num2;
	}
	public static void main(String[] args) {
		head1 = push(head1, 6);
		head1 = push(head1, 4);
		head1 = push(head1, 9);
		
		head2 = push(head2, 4);
		head2 = push(head2, 8);
		
		System.out.println("First list is : ");
		printList(head1);
		System.out.println("Second list is : ");
		printList(head2);
		System.out.println("Result after multiply is : " +multiplyTwoLists(head1, head2));
		
	}

}

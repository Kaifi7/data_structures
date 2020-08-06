package linked_list;

public class Get_intersection_point_of_two_lists {

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
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head_ref;
		head_ref = new_node;
		return head_ref;
	}
	static int count1 = 0, count2 = 0, diff = 0;
	static int intersectionPoint(Node node1, Node node2) {
		Node temp = node1;
		while(temp!=null) {
			count1++;
			temp = temp.next;
		}
		temp = node2;
		while(temp!=null) {
			count2++;
			temp = temp.next;
		}
		diff = Math.abs(count1 - count2); 
		if(count1>count2) {
			return getIntersection(diff, node1, node2);
		}
		else
			return getIntersection(diff, node2, node1);
		
	}
	static int getIntersection(int d, Node a, Node b) {
		Node temp = a;
		int count=0;
		while(temp!=null && count<d) {
			temp = temp.next;
			count++;
		}
		Node other = b;
		while(temp!=null && other!=null) {
			if(temp.data == other.data)
				return temp.data;
			temp = temp.next;
			other = other.next;
		}
		return -1;
	}
	public static void main(String[] args) {
		head1 = push(head1, 30);
		head1 = push(head1, 15);
		head1 = push(head1, 9);
		head1 = push(head1, 6);
		head1 = push(head1, 3);
		
		head2 = push(head2, 30);
		head2 = push(head2, 15);
		head2 = push(head2, 10);
		
		System.out.println("First list is : ");
		printList(head1);
		System.out.println("Second list is : ");
		printList(head2);
		System.out.println("Intersection point is : " +intersectionPoint(head1, head2));
		
	}

}

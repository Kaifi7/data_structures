package linked_list;

public class Flattening_a_linked_list {

	static class Node{
		int data;
		Node right, down;
		Node(int d){
			data = d;
			right = null;
			down = null;
		}
	}
	static Node head1, head2;
	static Node push(Node head_ref, int data) {
		Node new_node = new Node(data);
		new_node.down = head_ref;
		head_ref = new_node;
		return head_ref;
	}
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.down;
		}
		System.out.println();
	}
	static Node flatten(Node root) {
		if(root ==null || root.right == null)
			return root;
		root.right = flatten(root.right);
		root = merge(root, root.right);
		return root;
	}
	static Node merge(Node a, Node b) {
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node result;
		if(a.data < b.data) {
			result = a;
			result.down = merge(a.down, b);
		}
		else {
			result = b;
			result.down = merge(a, b.down);
		}
		result.right = null;
		return result;
	}
	public static void main(String[] args) {
		head1 = push(head1, 30);
		head1 = push(head1, 8);
		head1 = push(head1, 7);
		head1 = push(head1, 5);
		
		head1.right = push(head1.right, 20);
		head1.right = push(head1.right, 10);
		
		head1.right.right = push(head1.right.right, 50);
		head1.right.right = push(head1.right.right, 22);
		head1.right.right = push(head1.right.right, 19);
		
		head1.right.right.right = push(head1.right.right.right, 45);
		head1.right.right.right = push(head1.right.right.right, 40);
		head1.right.right.right = push(head1.right.right.right, 35);
		head1.right.right.right = push(head1.right.right.right, 20);
		
		head1 = flatten(head1);
		printList(head1);
	}

}

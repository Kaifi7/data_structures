package BST_practise;

public class Kth_smallest_element_in_O_n {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static int count = 0;
	static void KthSmallest(Node node, int k) {
		if( node == null || count>k)
			return;
		KthSmallest(node.left, k);
		count++;
		if(count == k) {
			System.out.println(node.data);
			return;
		}
		KthSmallest(node.right, k);
	}
	public static void main(String[] args) {
		root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		int k = 3;
		KthSmallest(root, k);
	}

}

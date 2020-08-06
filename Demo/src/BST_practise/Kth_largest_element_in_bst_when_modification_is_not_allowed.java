package BST_practise;

public class Kth_largest_element_in_bst_when_modification_is_not_allowed {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static int lar=-1, count=0;
	static void KthLargest(Node node, int k) {
		if(node == null || count>k)
			return ;
		KthLargest(node.right, k);
		count++;
		if(count == k) {
			lar = node.data;
			System.out.println(node.data);
		}
		KthLargest(node.left, k);
	} 
	public static void main(String[] args) {
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		int k = 5;
		KthLargest(root, k);
	}

}

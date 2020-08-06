package binary_trees;  			// Time complexity O(n)

public class Foldable_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			data = key;
			left = right = null;
		}
	}
	static Node root;
	static boolean isFoldable(Node node) {
		if(node == null)
			return true;
		return isFoldableUtil(node.left, node.right);
	}
	static boolean isFoldableUtil(Node a, Node b) {
		if(a== null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		
		return isFoldableUtil(a.left, b.right )
			&& isFoldableUtil(a.right, b.left); 
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.left.right = new Node(5);
		if(isFoldable(root))
			System.out.println("Tree is foldable");
		else
			System.out.println("Tree is not foldable");
	}

}

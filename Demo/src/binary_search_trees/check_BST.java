package binary_search_trees;

public class check_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	static Node root;
	static void insert(int key) {
		root = insertRec(root, key);
	}
	static Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.data) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	static boolean checkBST(Node root) {
		return checkBSTUtil(root);
	}
	static Node prev;
	static boolean checkBSTUtil(Node root) {
		if(root != null) {
			checkBSTUtil(root.left);
			if(prev!= null && prev.data>=root.data )
				return false;
			prev = root;
			checkBSTUtil(root.right);
		}
		return true;
	}
	public static void main(String[] args) {
		/*insert(50);
		insert(30);
		insert(20);
		insert(40);
		insert(70);
		insert(60);
		insert(80);
		*/
		Node root = new Node(3); 
	    root.left     = new Node(2); 
	    root.right     = new Node(5); 
	    root.left.left = new Node(1); 
	    root.left.right = new Node(4); 
		if(checkBST(root))
			System.out.println("Is BST");
		else
			System.out.println("Not a BST");
	}

}

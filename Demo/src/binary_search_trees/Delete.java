package binary_search_trees;

public class Delete {

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
		if(key< root.data)
			root.left = insertRec(root.left, key);
		else if(key> root.data)
			root.right = insertRec(root.right, key);
		return root;
	}
	static void inorder() {
		inorderRec(root);
	}
	static void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
		
	}
	static void deleteKey(int key) {
		deleteRec(root, key);
	}
	static Node deleteRec(Node root, int key) {
		if(root == null)
			return root;
		if(key<root.data)
			root.left = deleteRec(root.left, key);
		else if(key>root.data)
			root.right = deleteRec(root.right, key);
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, key);
		}
		return root;
	}
	static int minValue(Node root) {
		int minv = root.data;
		while(root.left!=null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	public static void main(String[] args) {
		insert(50);
		insert(30);
		insert(20);
		insert(40);
		insert(70);
		insert(60);
		insert(80);
		System.out.println("Inorder traversal of the given tree : ");
		inorder();
		System.out.println("\nDelete 20");
		deleteKey(20);
		System.out.println("Inorder traversal of the modified tree is : ");
		inorder();
	}

}

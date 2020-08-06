package binary_search_trees;

public class Search_and_insert {

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
		if(key<root.data)
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
	public static void main(String[] args) {
		insert(50);
		insert(30);
		insert(20);
		insert(40);
		insert(70);
		insert(60);
		insert(80);
		inorder();
	}

}

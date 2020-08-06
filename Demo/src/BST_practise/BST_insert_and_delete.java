package BST_practise;

public class BST_insert_and_delete {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static void inorder() {
		inorderRec(root);
		System.out.println();
	}
	static void inorderRec(Node root) {
		if(root == null)
			return;
		inorderRec(root.left);
		System.out.print(root.data + " ");
		inorderRec(root.right);
	}
	static void insert(int key) {
		root = insertRec(root, key);
	}
	static Node insertRec(Node node, int key) {
		if(node == null)
			return (new Node(key));
		if(node.data > key)
			node.left = insertRec(node.left, key);
		if(node.data < key)
			node.right = insertRec(node.right, key);
		return node;
	}
	static void delete(int key) {
		root = deleteRec(root, key);
	}
	static Node deleteRec(Node node, int key) {
		if(node == null)
			return null;
		if(key < node.data)
			node.left = deleteRec(node.left, key);
		else if(key > node.data)
			node.right = deleteRec(node.right, key);
		else {
			if(node.left == null)
				return node.right;
			else if(node.right == null)
				return node.left;
			node.data = minValue(node.right);
			node.right = deleteRec(node.right, node.data);
		}
		return node;
	}
	static int minValue(Node node) {
		int minv = node.data;
		while(node.left!=null) {
			minv = node.left.data;
			node = node.left;
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
		inorder();
		delete(20);
		inorder();
		delete(30);
		inorder();
		delete(50);
		inorder();
	}

}

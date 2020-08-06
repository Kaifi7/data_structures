package binary_search_trees;

public class Second_largest_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right;
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
	static void inorder() {
		inorderRec(root);
	}
	static int count=0;
	static void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.right);
			count++;
			if(count==2) {
				System.out.println("Second largest element is : " +root.data);
				return;
			}
			inorderRec(root.left);
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

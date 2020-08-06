package BST_practise;

import java.util.HashSet;
import java.util.Set;

public class Binary_tree_to_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static Set<Integer>s = new HashSet<Integer>();
	static Node newNode(int new_data) {
		Node new_node = new Node(new_data);
		new_node.left = null;
		new_node.right = null;
		return new_node;
	}
	static void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	static void binaryTreeToBST(Node root) {
		s.clear();
		storeInorderInSet(root);
		setToBST(root);
	}
	static void storeInorderInSet(Node root) {
		if(root == null)
			return;
		storeInorderInSet(root.left);
		s.add(root.data);
		storeInorderInSet(root.right);
	}
	static void setToBST(Node root) {
		if(root == null)
			return;
		setToBST(root.left);
		root.data = s.iterator().next();
		s.remove(root.data);
		setToBST(root.right);
	}
	public static void main(String[] args) {
		Node root = newNode(5);
		root.left = newNode(7);
		root.right = newNode(9);
		root.right.left = newNode(10);
		root.left.left = newNode(1);
		root.left.right = newNode(6);
		root.right.right = newNode(11);
		binaryTreeToBST(root); 
	    System.out.println( "Inorder traversal of BST is: " ); 
	    inorder(root); 
		
	}

}

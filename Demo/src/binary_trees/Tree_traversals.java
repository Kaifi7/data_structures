package binary_trees;		//time complexity O(n)

public class Tree_traversals {
	
	static class Node{
		int key;
		Node left, right;
		Node(int item){
			key = item;
			left = right = null;
		}
	}
	static Node root;
	static void preOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	static void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	static void postOrder(Node node){
		if(node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}
	static void preOrder() {
		preOrder(root);
	} 
	static void inOrder() {
		inOrder(root);
	}
	static void postOrder() {
		postOrder(root);
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right =new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("preorder traversal of binary tree is : ");
		preOrder();
		System.out.println("inorder traversal of binary tree is : ");
		inOrder();
		System.out.println("postorder traversal of binary tree is : ");
		postOrder();
	}

}

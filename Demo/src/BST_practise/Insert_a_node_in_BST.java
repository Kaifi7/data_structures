package BST_practise;

public class Insert_a_node_in_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	static void insert(int data) {
		root = insertRec(root, data);
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
	public static void main(String[] args) {
		 	insert(50); 
	        insert(30); 
	        insert(20); 
	        insert(40); 
	        insert(70); 
	        insert(60); 
	        insert(80); 
	        inorder(root);
	}

}

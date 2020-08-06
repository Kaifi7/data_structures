package binary_search_trees;

public class LCA_in_BST {

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
		if(root.data > key) {
			root.left = insertRec(root.left, key);
		}
		if(root.data < key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	static Node lca(Node node, int a, int b) {
		if(node == null)
			return null;
		if(node.data > a && node.data > b)
			return lca(node.left, a, b);
		if(node.data < a && node.data < b)
			return lca(node.right, a, b);
		return node;
	}
	public static void main(String[] args) {
        insert(20);
        insert(8);
        insert(22);
        insert(4);
        insert(12);
        insert(10);
        insert(14);
		int n1 = 10, n2 = 14; 
        Node t = lca(root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
        n1 = 10; n2 = 22; 
        t = lca(root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
		
	}

}

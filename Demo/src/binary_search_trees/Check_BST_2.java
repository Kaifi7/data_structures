package binary_search_trees;

public class Check_BST_2 {

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
	static Node newNode(int data) {
		Node new_node = new Node(data);
		new_node.left = new_node.right = null;
		return new_node;
	}
	static boolean isBST(Node root, Node l, Node r) {
		if( root == null)
			return true;
		if(l!=null && root.data <= l.data)
			return false;
		if(r!=null && root.data >= r.data)
			return false;
		return isBST(root.left, l, root) && isBST(root.right, root, r);	
	}
	public static void main(String[] args) {
		root = newNode(3);
		root.left = newNode(2);
		root.right = newNode(5);
		root.left.left = newNode(1);
		root.left.right = newNode(4);
		
		if (isBST(root,null,null))  
	        System.out.print("Is BST");  
	    else
	        System.out.print("Not a BST"); 
	}

}

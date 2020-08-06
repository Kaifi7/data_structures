
public class Top_view_BT {

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
	static void TopView(Node node) {
		
	}
	public static void main(String[] args) {
		 	root = new Node(1); 
	        root.left = new Node(2); 
	        root.right = new Node(3); 
	        root.left.right = new Node(4); 
	        root.left.right.right = new Node(5); 
	        root.left.right.right.right = new Node(6); 
	        System.out.println("Following are nodes in top view of Binary Tree");  
	        TopView(root);  
	}

}

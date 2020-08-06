package binary_trees;

public class Determine_if_binary_tree_is_balanced {

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
	static class Height{
		int height =0;
	}
	static boolean isBalanced(Node root, Height height) {
		if(root == null) {
			height.height =0;
			return true;
		}
		Height lheight = new Height(), rheight = new Height();
		boolean l = isBalanced(root.left, lheight);
		boolean r = isBalanced(root.right, rheight);
		int lh = lheight.height, rh = rheight.height;
		height.height = (lh>rh ? lh:rh)+1;
		if(Math.abs(lh-rh)>=2)
			return false;
		else
			return l&r;
	}
	public static void main(String[] args) {
		root= new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		 Height height = new Height(); 
		 if (isBalanced(root, height)) 
	          System.out.println("Tree is balanced"); 
	     else
	          System.out.println("Tree is not balanced"); 
	}

}

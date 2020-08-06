package binary_trees;

public class Minimum_depth_of_binary_tree {

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
	static int minimumDepth() {
		return minimumDepthUtil(root, 0);
	}
	static int minimumDepthUtil(Node root, int level) {
		if(root == null)
			return level;
		return Math.min(minimumDepthUtil(root.left, level+1), minimumDepthUtil(root.right, level+1)); //depth of tree
		//Math.max(minimumDepthUtil(root.left, level+1), minimumDepthUtil(root.right, level+1)); can be used for height of tree
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		System.out.println("Minimum depth of binary tree is : " +minimumDepth());
	}

}



public class Min_depth_BT {

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
		int level =0;
		return minimumDepthUtil(root, level);
	}
	static int minimumDepthUtil(Node node, int level) {
		if(node == null)
			return level;
		return Math.min(minimumDepthUtil(node.left, level+1), minimumDepthUtil(node.right, level+1));
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

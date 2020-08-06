package binary_trees;

public class Right_view_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int d){
			key = d;
			left = null;
			right = null;
		}
	}
	static Node root = null;
	static int maxLevel = 0;
	static void rightView() {
		rightViewUtil(root, 1);
	}
	static void rightViewUtil(Node node, int level) {
		if (node == null)
			return;
		if(maxLevel < level) {
			System.out.print(node.key + " ");
			maxLevel =level;
		}
		rightViewUtil(node.right, level+1);
		rightViewUtil(node.left, level+1);
			
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		rightView();
	}

}

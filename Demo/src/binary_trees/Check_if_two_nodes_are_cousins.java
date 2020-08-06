package binary_trees;

public class Check_if_two_nodes_are_cousins {

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
	static boolean isCousin(Node node, Node a, Node b) {
		return ((level(node,a,1) == level(node, b,1)) && (!isSibling(node, a, b)));
	}
	static int level(Node node, Node ptr, int lev) {
		if(node == null)
			return 0;
		if(node == ptr)
			return lev;
		int l = level(node.left, ptr, lev+1);
		if(l!=0)
			return l;
		return level(node.right, ptr, lev+1);
	}
	static boolean isSibling(Node node, Node a , Node b) {
		if(node == null)
			return false;
		return ((node.left == a && node.right == b) ||
				(node.left == b && node.right == a) ||
				isSibling(node.left, a, b) ||
				isSibling(node.right, a, b));
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(15);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		Node node1, node2;
		node1 = root.left.right.right;
		node2 = root.right.left.right;
		if(isCousin(root, node1, node2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

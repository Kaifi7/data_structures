package binary_trees;

public class Leaf_nodes_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node root;
	static int count = 0;
	static int countLeaves(Node node) {
		if(node == null)
			return 0;
		if(node!= null && node.left==null && node.right==null)
			return 1;
		return countLeaves(node.left) + countLeaves(node.right);
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("The leaf count of binary tree is : ");
		System.out.println(countLeaves(root));
	}

}

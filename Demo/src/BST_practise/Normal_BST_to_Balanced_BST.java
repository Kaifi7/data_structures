package BST_practise;

import java.util.Vector;

public class Normal_BST_to_Balanced_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static void preOrder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	static Node buildTree(Node root) {
		Vector<Node>nodes = new Vector<Node>();
		storeBSTNodes(root, nodes);
		int n = nodes.size();
		return buildTreeUtil(nodes, 0, n-1);
	}
	static Node buildTreeUtil(Vector<Node>nodes, int start, int end) {
		if(start > end)
			return null;
		int mid = (start + end )/2;
		Node node = nodes.get(mid);
		node.left = buildTreeUtil(nodes, start, mid-1);
		node.right = buildTreeUtil(nodes, mid+1, end);
		return node;
	}
	static void storeBSTNodes(Node root, Vector<Node>nodes) {
		if(root == null)
			return;
		storeBSTNodes(root.left, nodes);
		nodes.add(root);
		storeBSTNodes(root.right, nodes);
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(7);
		root.left.left.left = new Node(6);
		root.left.left.left.left = new Node(5);
		root = buildTree(root);
		preOrder(root);
	}

}

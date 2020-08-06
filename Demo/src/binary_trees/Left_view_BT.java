package binary_trees;

import java.util.LinkedList;
import java.util.Queue;
// left view of tree means when tree is visited from left side.
// 	The left view contains all nodes that are first nodes in their levels. do level order traversal and print first nodes at each level
public class Left_view_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node root, tempNode;
	static int maxLevel = 0;
	static void leftView() {
		leftViewUtil(root, 1);
	}
	static void leftViewUtil(Node node, int level) {
		if(node == null)
			return;
		if(maxLevel < level) {
			System.out.print(" " +node.key);
			maxLevel = level;
		}
		leftViewUtil(node.left, level+1);
		leftViewUtil(node.right, level+1);
	}
	public static void main(String[] args) {
		root = new Node(12);
		root.left = new Node(10);
		root.right = new Node(30);
		root.right.left = new Node(25);
		root.right.right = new Node(40);
		System.out.println("Left view of this Binary Tree is : ");
		leftView();
	}

}

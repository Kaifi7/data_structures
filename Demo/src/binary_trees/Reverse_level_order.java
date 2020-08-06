package binary_trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_level_order {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node temp, root;
	static void reverseLevelOrder(Node node) {
		Queue<Node>q = new LinkedList<Node>();
		Stack<Node>s = new Stack();
		q.add(node);
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			s.push(node);
			
			if(node.right!=null) {
				q.add(node.right);
			}
			
			if(node.left!=null) {
				q.add(node.left);
			}
			
		}
		while(!s.isEmpty()) {
			node = s.peek();
			System.out.print(node.key + " ");
			s.pop();
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Level order traversal of a binary tree is : ");
		reverseLevelOrder(root);
	}
}

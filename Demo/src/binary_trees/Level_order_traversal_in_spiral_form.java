package binary_trees;

import java.util.Stack;

public class Level_order_traversal_in_spiral_form {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right =null;
		}
	}
	static Node root;
	
	static void printSpiral(Node node) {
		if(node == null)
			return;
		Stack<Node>s1 = new Stack<Node>();
		Stack<Node>s2 = new Stack<Node>();
		s1.push(node);
		while(!s1.empty() || !s2.empty()) {
			while(!s1.empty()) {
				Node temp = s1.peek();
				s1.pop();
				System.out.print(temp.data + " ");
				if(temp.right!=null)
					s2.push(temp.right);
				if(temp.left!=null)
					s2.push(temp.left);
			}
			while(!s2.empty()) {
				Node temp = s2.peek();
				s2.pop();
				System.out.print(temp.data + " ");
				if(temp.left!=null)
					s1.push(temp.left);
				if(temp.right!=null)
					s1.push(temp.right);
			}
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		System.out.println("Spiral order traversal of binary tree is : ");
		printSpiral(root); 
	}

}

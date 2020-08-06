package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Max_width_of_a_tree {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =null;
			right =null;
		}
	}
	static Node root;
	static int maxwidth = 0;
	static int maxWidth(Node root) {
		if(root == null)
			return 0;
		Queue<Node>q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count = q.size();
			maxwidth = Math.max(maxwidth, count);
			while(count>0) {
				Node temp = q.remove();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				count--;
			}
		}
		return maxwidth;
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(8);
		root.right.right.left =new Node(6);
		root.right.right.right = new Node(7);
		System.out.println("Maximum width = " +maxWidth(root));
	}

}

package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Print_leftmost_and_rightmost_nodes_of_BT {

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
	static void printCorner(Node root) {
		Queue<Node>q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			int count = q.size();
				for(int i=0;i<count;i++) {
					Node temp = q.poll();
					if(i==0 || i==count-1)
						System.out.print(temp.data + " ");
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
		}
	}
	public static void main(String[] args) {
		root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
		printCorner(root);
	}

}

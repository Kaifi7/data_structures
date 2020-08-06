package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Check_leaves_level {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	static class Leaf{
		int leaflevel =0;
	}
	static Node root;
	static boolean check(Node root) {
		if(root == null)
			return true;
		Queue<Node>q = new LinkedList<>();
		q.add(root);
		int result = Integer.MAX_VALUE;
		int level = 0;
		while(q.size()!=0) {
			int size = q.size();
			level++;
			while(size>0) {
				Node temp = q.remove();
				if(temp.left!=null) {
					q.add(temp.left);
				//	if(temp.left.left == null && temp.left.right == null)
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		root = new Node(12);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(9);
		root.left.left.left = new Node(1);
		root.left.right.right = new Node(1);
		if(check(root))
			System.out.println("Leaves are at same level");
		else
			System.out.println("Leaves are not at same level");
	}

}

package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Find_level_max_sum_in_BT {

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
	static Node newNode(int data) {
		Node new_node = new Node(data);
		new_node.left = new_node.right = null;
		return new_node;
	}
	static int maxLevelSum(Node root) {
		if(root == null)
			return 0;
		int result = root.data;
		Queue<Node>q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			int count = q.size();
			int sum =0;
			while(count>0) {
				count--;
				Node temp = q.peek();
				q.poll();
				sum = sum + temp.data;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
			result = Math.max(sum, result);
		}
		return result;	
	}
	public static void main(String[] args) {
		root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
		root.right.right = newNode(8);
		root.right.right.left = newNode(6);
		root.right.right.right = newNode(7);
		System.out.println("Maximum level sum is : " +maxLevelSum(root));
	}

}

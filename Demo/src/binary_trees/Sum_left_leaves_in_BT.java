package binary_trees;

public class Sum_left_leaves_in_BT {

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
	static int leftSum =0;
	static int rightSum = 0;
	static void leftLeavesSum(Node root) {
		if(root == null)
			return;
		if(root.left!=null) {
			if(root.left.left == null && root.left.right == null) {
				leftSum = leftSum + root.left.data;
			}
		}
		leftLeavesSum(root.left);
		leftLeavesSum(root.right);
	}
	static void rightLeavesSum(Node root) {
		if(root == null)
			return;
		if(root.right!=null) {
			if(root.right.left == null && root.right.right == null) {
				rightSum = rightSum + root.right.data;
			}
		}
		rightLeavesSum(root.left);
		rightLeavesSum(root.right);
	}
	public static void main(String[] args) {
		/*
		root = new Node(20);
		root.left = new Node(9);
		root.right = new Node(49);
		root.left.right = new Node(12);
		root.left.left = new Node(5);
		root.right.left = new Node(23);
		root.right.right = new Node(52);
		root.left.right.right = new Node(12);
		root.right.right.left = new Node(50);
		leftLeavesSum(root);
		System.out.println("sum of left leaves is : " +leftSum);*/
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(2);
		root.right.right = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		rightLeavesSum(root);
		System.out.println("sum of right leaves is : " +rightSum);
	}

}

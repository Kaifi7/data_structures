package binary_trees;

import java.util.HashSet;

public class Duplicate_value_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			data = key;
			left = right = null;
		}
	}
	static Node root;
	public static boolean checkDup(Node root){
		HashSet<Integer>s = new HashSet<>();
		return checkDupUtil(root, s);
	}
	public static boolean checkDupUtil(Node root, HashSet<Integer>s) {
		if(root == null)
			return false;
		
		if(s.contains(root.key))
			return true;
		s.add(root.key);
		
		return checkDupUtil(root.left, s) || checkDupUtil(root.right, s);
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3);
		if(checkDup(root))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

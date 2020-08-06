package binary_search_trees;

import java.util.HashSet;
import java.util.Set;

public class Given_paIr_sum_BST {

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
	static void insert(int key) {
		root = insertRec(root, key);
	}
	static Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.data) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	static void findPair(Node root, int sum) {
		HashSet<Integer>set = new HashSet<Integer>();
		if(!findPairUtil(root, sum, set))
			System.out.println("Pairs do not exists");
	}
	static boolean findPairUtil(Node root, int sum, HashSet<Integer>set) {
		if(root == null)
			return false;
		if(findPairUtil(root.left, sum, set))
			return true;
		if(set.contains(sum-root.data)) {
			System.out.println("Pair is found ( " + (sum - root.data) + " ," + root.data + " )");
			return true;
		}
		else
			set.add(root.data);
		return findPairUtil(root.right, sum, set);
	}
	public static void main(String[] args) {
		insert(15);
		insert(10);
		insert(20);
		insert(8);
		insert(12);
		insert(16);
		insert(25);
		insert(10);
		int sum = 33; 
        findPair(root, sum); 
        
	}

}

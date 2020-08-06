package binary_trees;

import java.util.Set;
import java.util.TreeMap;

public class Vertical_sum_in_binary_tree {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =null;
			right = null;
		}
	}
	static Node root;
	static void verticalSum(Node root) {
		if(root == null)
			return;
		TreeMap<Integer, Integer> hM = new TreeMap<Integer, Integer>();
		verticalSumUtil(root, 0, hM);
		if(hM!=null) {
			System.out.println(hM.entrySet());
		}
		System.out.println("Max vertical sum in binary tree is : ");
		int max=-1;
		Set<Integer>keys = hM.keySet();
		for(Integer key : keys) {
			if(hM.get(key)>max)
				max = hM.get(key);
		}
		System.out.println(max);
	}
	static void verticalSumUtil(Node root, int hD, TreeMap<Integer, Integer>hM) {
		if(root == null)
			return;
		verticalSumUtil(root.left, hD-1, hM);
		int prevSum = (hM.get(hD) == null) ? 0:hM.get(hD);
		hM.put(hD, prevSum + root.data);
		verticalSumUtil(root.right, hD+1, hM);
	} 
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("Following are the values of" +  
                " vertical sums with the positions" + 
             " of the columns with respect to root "); 
		verticalSum(root); 
	}

}

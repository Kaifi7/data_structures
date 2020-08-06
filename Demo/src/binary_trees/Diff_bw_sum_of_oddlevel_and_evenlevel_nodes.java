package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Diff_bw_sum_of_oddlevel_and_evenlevel_nodes {

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
	static int oddSum = 0, evenSum = 0, dif = 0;
	static boolean level = true;
	static int evenOddLevelDifference(Node node) {
		if(node == null)
			return 0;
		Queue<Node>q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int count = q.size();
			while(count>0) {
				Node temp = q.peek();
				q.remove();
				if(level)
					oddSum +=temp.data;
				else
					evenSum += temp.data;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				count--;
			}
			level = !level;
		}
		System.out.println(oddSum + " " +evenSum);
		return (oddSum - evenSum);
	}
	public static void main(String[] args) {
		root = new Node(5);
		root.left = new Node(2); 
        root.right = new Node(6); 
        root.left.left = new Node(1); 
        root.left.right = new Node(4); 
        root.left.right.left = new Node(3); 
        root.right.right = new Node(8); 
        root.right.right.right = new Node(9); 
        root.right.right.left = new Node(7);
        System.out.println("diffence between sums is " +  
                evenOddLevelDifference(root)); 
	}

}

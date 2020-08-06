package binary_trees;

public class Shortest_root_to_leaf_path_sum {

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
	static int mini;
	static void hasPathSum(Node node, int sum, int level) {
		if(node == null)
			return;
			int subSum = sum - (node.data);
			if(node.left == null && node.right == null) {
				if(subSum == 0)
					mini = Math.min(level-1, mini);
				return;
			}
			else {
				hasPathSum(node.left, subSum, level+1);
				hasPathSum(node.right, subSum, level+1);
			}
	}
	public static void main(String[] args) {
		int sum =16;
		root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(5);
		root.left.right = new Node(2);	
		mini = Integer.MAX_VALUE;
		hasPathSum(root, sum, 0);
		if(mini!=Integer.MAX_VALUE)
			System.out.println("There is root to leaf path with sum " +sum + " and the shortest path length is : " +mini+1);
	}

}

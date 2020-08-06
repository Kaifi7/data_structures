package binary_trees;

public class Root_to_leaf_path_sum {

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
	static boolean hasPathSum(Node node, int sum) {
		if(node == null)
			return false;
		if(node.left == null && node.right == null) {
			return sum-node.data == 0;
		}
		return hasPathSum(node.left, sum-node.data) || hasPathSum(node.right, sum - node.data);
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		int sum = 21;
		if (hasPathSum(root, sum)) 
            System.out.println("There is a root to leaf path with sum " + sum); 
        else
            System.out.println("There is no root to leaf path with sum " + sum); 
	}

}

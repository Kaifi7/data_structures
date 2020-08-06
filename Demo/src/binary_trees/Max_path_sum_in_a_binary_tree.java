package binary_trees;

public class Max_path_sum_in_a_binary_tree {

	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left =null;
			right =null;
		}
	}
	static class Res{
		public int val;
	}
	static Node root;
	static int findMaxSum() {
		return findMaxSum(root);
	}
	static int findMaxSum(Node node) {
		Res res = new Res();
		res.val = Integer.MIN_VALUE;
		System.out.println(findMaxUtil(node, res));
		return res.val;
	}
	static int findMaxUtil(Node node, Res res) {
		if(node == null)
			return 0;
		int l = findMaxUtil(node.left, res);
		int r = findMaxUtil(node.right, res);
		int max_single = Math.max(Math.max(l, r)+node.data, node.data);
		int max_top = Math.max(max_single, l+r+node.data);
		res.val = Math.max(max_top, res.val);
		return max_single;
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(10);
		root.left.left = new Node(20);
		root.left.right = new Node(1);
		root.right.right = new Node(-25);
		root.right.right.left = new Node(3);
		root.right.right.right = new Node(4);
		System.out.println("maximum path sum is : " + 
                findMaxSum()); 
	}

}

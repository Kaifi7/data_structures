package binary_search_trees;

public class Count_BST_nodes_that_Are_in_a_given_range {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =  null;
			right = null;
		}
	}
	static Node root;
	static int getCount(Node node, int low, int high) {
		if(node == null)
			return 0;
		if(node.data >=low && node.data <=high)
			return 1 + getCount(node.left, low, high) + getCount(node.right, low, high);
		else if(node.data < low)
			return getCount(node.right, low, high);
		else
			return getCount(node.left, low, high);
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(50);
		root.left.left = new Node(1);
		root.right.left = new Node(40);
		root.right.right = new Node(100);
		int l = 5, h=45;
		System.out.println("Count of nodes between [" + l + ", "
                + h+ "] is " + getCount(root, 
                        l, h));
	}

}

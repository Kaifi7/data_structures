package BST_practise;

public class Count_nodes_in_a_given_range {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static int count = 0;
	public int countNodes(Node node, int l, int h) {
		if(node == null)
			return 0;
		if(node.data >=l && node.data <=h )
			return 1+ this.countNodes(node.left, l, h) + this.countNodes(node.right, l, h);
		else if(node.data < l)
			return this.countNodes(node.right, l, h);
		else
			return this.countNodes(node.left, l, h);
	}
	public static void main(String[] args) {
		Count_nodes_in_a_given_range c = new Count_nodes_in_a_given_range();
		root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(50);
		root.left.left = new Node(1);
		root.right.left = new Node(40);
		root.right.right = new Node(100);
		int l =5, h= 50;
		System.out.println(c.countNodes(root, l, h));
	}

}

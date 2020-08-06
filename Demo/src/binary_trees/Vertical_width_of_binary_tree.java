package binary_trees;

public class Vertical_width_of_binary_tree {

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
	static int maximum = 0, minimum = 0;
	static Node newNode(int new_data) {
		Node new_node = new Node(new_data);
		return new_node;
	}
	static int getLength(Node root) {
		maximum = 0; minimum = 0;
		lengthUtil(root, 0);
		return (Math.abs(minimum) + maximum)+1;
	}
	static void lengthUtil(Node root, int curr) {
		if(root == null)
			return;
		lengthUtil(root.left, curr-1);
		if(minimum>curr)
			minimum = curr;
		if(maximum<curr)
			maximum = curr;
		lengthUtil(root.right, curr+1);
	}
	public static void main(String[] args) {
		root = newNode(7);
		root.left = newNode(6);
		root.right = newNode(5);
		root.left.left = newNode(4);
		root.left.right = newNode(3);
		root.right.left = newNode(2);
		root.right.right = newNode(1);
		System.out.println(getLength(root));
	}

}

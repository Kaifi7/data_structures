package binary_trees;

public class Diameter_of_binary_tree {

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
	static class A{
		int ans = Integer.MIN_VALUE;
	}
	static int height(Node root, A a) {
		if(root == null)
			return 0;
		int left_height = height(root.left, a);
		int right_height = height(root.right, a);
		a.ans = Math.max(a.ans, 1+left_height+right_height);
		return 1+ Math.max(left_height, right_height);
	}
	static int diameter() {
		if(root==null)
			return 0;
		A a =new A();
		int height_of_tree = height(root, a);
		System.out.println(height_of_tree);
		return a.ans;
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("Diameter of given tree is : " +diameter());
	}

}

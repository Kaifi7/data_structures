package BST_practise;

public class LCA_in_a_bst {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =right = null;
		}
	}
	static Node root;
	static Node lca(Node root, int a, int b) {
		if(root == null)
			return null;
		if(a < root.data && b<root.data)
			return lca(root.left, a, b);
		if(root.data < a && root.data <b)
		return lca(root.right,a, b);
		return root;
	}
	public static void main(String[] args) {
		root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left =  new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		int n1=8, n2 = 14;
		Node t = lca(root, n1, n2);
		System.out.println(t.data);
	}

}

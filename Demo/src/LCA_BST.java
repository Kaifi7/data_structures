public class LCA_BST {

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
	static Node lca(Node node, int a, int b) {
		if(root == null)
			return null;
		if(a<node.data && b<node.data)
			return lca(node.left, a, b);
		if(a>node.data && b> node.data)
			return lca(node.right, a, b);
		return node;
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

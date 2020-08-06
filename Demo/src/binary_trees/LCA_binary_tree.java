package binary_trees;

public class LCA_binary_tree {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node root, lca, temp = null;
	static Node left_lca, right_lca;
	static boolean v1=false, v2=false;
	static Node findLCA(int n1, int n2) {
		v1=false;
		v2=false;
		lca = findLCAUtil(root, n1, n2);
		if(v1 && v2)
			return lca;
		else
			return null;
	}
	static Node findLCAUtil(Node node, int n1, int n2) {
		if(node == null)
			return null;
		temp = null;
		if(node.key == n1) {
			v1 = true;
			temp = node;
		}
		if(node.key == n2) {
			v2 = true;
			temp = node;
		}
		left_lca = findLCAUtil(node.left, n1, n2);
		right_lca = findLCAUtil(node.right, n1, n2);
		if(temp!=null)
			return temp;
		
		if(left_lca != null && right_lca !=null)
			return node;
		
		return (left_lca!=null)?left_lca : right_lca;
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left =new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		lca = findLCA(4,5);
		if(lca!=null)
			System.out.println(lca.key);
		else
			System.out.println("Keys are not present");
	}

}

package binary_trees;

public class Check_if_binary_tree_is_a_subtree {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	static Node root1, root2;
	static boolean isSubtree(Node T, Node S) {
		if(S==null)
			return false;
		if(T==null)
			return false;
		if(areIdentical(T, S))
			return true;
		return isSubtree(T.left, S) || isSubtree(T.right, S);
	}
	static boolean  areIdentical(Node a, Node b) {
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		return (a.data == b.data && areIdentical(a.left, b.left) && areIdentical(a.right, b.right));
	}
	public static void main(String[] args) {
		root1 = new Node(26);
		root1.right = new Node(3);
		root1.right.right = new Node(3);
		root1.left = new Node(10);
		root1.left.left = new Node(4);
		root1.left.left.right = new Node(30);
		root1.left.right = new Node(6);
		
		root2 = new Node(10);
		root2.right = new Node(6);
		root2.left = new Node(4);
		root2.left.right = new Node(30);
		if(isSubtree(root1, root2))
			System.out.println("Tree 2 is a subtree of Tree 1");
		else
			System.out.println("Tree 2 is not a subtree of tree 1");
	}

}

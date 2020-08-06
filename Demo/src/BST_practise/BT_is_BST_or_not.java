package BST_practise;

public class BT_is_BST_or_not {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static Node prev;
	static boolean isBST() {
		prev = null;
		return isBST(root);
	}
	static boolean isBST(Node node) {
		if(node!=null) {
			if(!isBST(node.left))
				return false;
			if(prev!=null && prev.data >= node.data)
				return false;
			prev = node;
			return isBST(node.right);
		}
		return true;
	}
	public static void main(String[] args) {
		root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		if(isBST())
			System.out.println("Is BST");
		else
			System.out.println("Not a BST");
	}

}

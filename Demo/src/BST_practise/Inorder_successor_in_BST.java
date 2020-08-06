package BST_practise;

public class Inorder_successor_in_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root, succ=null, node = null;
	static void insert(int key) {
		root = insertRec(root, key );
	}
	static Node insertRec(Node node, int key) {
		if(node == null)
			return (new Node(key));
		if(node.data > key)
			node.left = insertRec(node.left, key);
		else if(node.data < key)
			node.right = insertRec(node.right, key);
		return node;
	}
	static int minValue(Node node) {
		int minv = node.data;
		while(node.left!=null) {
			minv = node.left.data;
			node = node.left;
		}
		return minv;
	}
	static int inorderSuc(Node node, Node d) {
		if(d.right!=null)
			return minValue(d.right);
		while(node!=null) {
			if(d.data < node.data) {
				succ = node;
				node = node.left;
			}
			else if(d.data > node.data)
				node = node.right;
			else
				break;
		}
		return succ.data;
	}
	public static void main(String[] args) {
		insert(5);
		insert(4);
		insert(6);
		insert(7);
		insert(2);
		node = new Node(4);
		System.out.println(inorderSuc(root, node));
	}

}

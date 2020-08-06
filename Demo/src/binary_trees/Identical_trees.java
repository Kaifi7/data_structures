package binary_trees;

public class Identical_trees {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node a, b;
	static boolean identicalTrees(Node a, Node b) {
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		if(a!=null && b!=null)
			return (a.key==b.key
			&& identicalTrees(a.left, b.left)
			&& identicalTrees(a.right, b.right));
		
		return false;
	}
	public static void main(String[] args) {
		a = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);
		
		b= new Node(1);
		b.left = new Node(2);
		b.right = new Node(3);
		b.left.left = new Node(4);
		b.left.right = new Node(5);
		System.out.println(identicalTrees(a,b));
	}

}

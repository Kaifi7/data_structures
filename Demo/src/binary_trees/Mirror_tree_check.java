package binary_trees;			//time complexity O(n)

public class Mirror_tree_check {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right =null;
		}
	}
	static Node a,b;
	static boolean areMirror(Node a, Node b) {
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		
		return a.key==b.key
				&& areMirror(a.left, b.right)
				&& areMirror(a.right, b.left);
	}
	public static void main(String[] args) {
		a = new Node(1);
		b = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);
		
		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
		b.right.right = new Node(4);
		System.out.println(areMirror(a,b));
		
	}

}

package binary_search_trees;

public class Shortest_distance_bw_2_nodes {

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
	static void insert(int key) {
		root = insertRec(root, key);
	}
	static Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertRec(root.left, key);
		}
		if(key > root.data) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	static int distanceFromRoot(Node root, int x) {
		if(root.data == x)
			return 0;
		else if(root.data > x)
			return 1 + distanceFromRoot(root.left, x);
		return 1 + distanceFromRoot(root.right,x);
	}
	static int distanceBetween2(Node root, int a, int b) {
		if(root == null)
			return 0;
		if(root.data >a && root.data > b)
			return distanceBetween2(root.left, a, b);
		if(root.data < a && root.data < b)
			return distanceBetween2(root.right, a, b);
		if((root.data >=a && root.data <=b) || (root.data <= a && root.data >= b))
			return distanceFromRoot(root, a) + distanceFromRoot(root, b);
		return 0;
	}
	static int findDistWrapper(Node root, int a, int b) {
		/*int temp =0;
		if(a>b) {
			temp =a ;
			a = b;
			b = temp;
		}*/
		return distanceBetween2(root, a, b);
	}
	public static void main(String[] args) {
		insert(10);
		insert(5);
		insert(15);
		insert(30);
		insert(25);
		insert(35);
		System.out.println(findDistWrapper(root, 5, 35));
	}

}

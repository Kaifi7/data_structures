package linked_list;

public class All_root_o_leaf_path {

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
	static int sum=0, maxSum=0;
	static void printArray(int arr[], int len) {
		sum = 0;
		for(int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		if(maxSum<sum)
			maxSum = sum;
		System.out.println();
	}
	static void printPaths(Node node) {
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}
	static void printPathsRecur(Node node, int path[], int pathLen) {
		if(node == null)
			return;
		path[pathLen] = node.data;
		pathLen++;
		if(node.left == null && node.right == null)
			printArray(path, pathLen);
		else {
			printPathsRecur(node.left, path, pathLen);
			printPathsRecur(node.right, path, pathLen);
		}
	}
	public static void main(String[] args) {
		root= new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		printPaths(root);
		System.out.println(maxSum);
	}

}

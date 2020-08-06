package BST_practise;

public class Sorted_array_to_balanced_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static void preOrder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	static Node sortedArrayToBST(int arr[], int l, int r) {
		if(l>r)
			return null;
		int mid = (l+r)/2;
		Node node = new Node(arr[mid]);
		node.left = sortedArrayToBST(arr, l, mid-1);
		node.right = sortedArrayToBST(arr, mid+1, r);
		return node;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		root = sortedArrayToBST(arr, 0, n-1);
		System.out.println("preorder traversal of constructed BST : ");
		preOrder(root);
	}

}

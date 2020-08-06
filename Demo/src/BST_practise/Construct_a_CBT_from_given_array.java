package BST_practise;
//level order
public class Construct_a_CBT_from_given_array {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =right = null;
		}
	}
	static Node root, root1;
	static void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	static Node insertLevelOrder(int arr[], Node root, int i) {
		if(i<arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;
			root.left = insertLevelOrder(arr, root.left, 2*i+1);
			root.right = insertLevelOrder(arr, root.right, 2*i+2);
		}
		return root;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 6, 6, 6};
		root1 = insertLevelOrder(arr, root, 0);
		inorder(root1);
	}

}

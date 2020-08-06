package BST_practise;

import BST_practise.Kth_largest_element_in_bst_when_modification_is_not_allowed.Node;

public class Kth_largest_element_using_O_h {

	static class Node{
		int data;
		int rcount ;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
			rcount = 0;
		}
	}
	static Node root = null;
	static Node insert(Node root, int data) {
		if(root == null)
			return (new Node(data));
		if(root.data < data) {
			root.right = insert(root.right, data);
			root.rcount++;
		}
		else if(root.data > data) {
			root.left = insert(root.left, data);
		}
		return root;
	}
	static Node kthLargest(Node node, int k) {
		if(node == null)
			return null;
		int count = root.rcount + 1;
		System.out.println(count);
		if(count == k)
			return node;
		else if(count > k)
			return kthLargest(node.right, k);
		return kthLargest(node.left, k-count);
	}
	public static void main(String[] args) {
		int keys[] = {20, 8, 22, 4, 12, 10, 14};
		for(int x : keys) {
			root = insert(root, x);
		}
		int k =1;
		Node res = kthLargest(root, k);
		if(res == null)
			System.out.println("There are less than k nodes in bst");
		else
			System.out.println("Kth largest element is : " +res.data);
	}

}

package BST_practise;

public class Kth_smallest_using_O_h {

	static class Node{
		int data;
		int lcount;
		Node left, right;
		Node(int d){
			data = d;
			lcount=0;
			left = right = null;
		}
	}
	static Node root;
	static Node insert(Node root, int x) {
		if(root == null)
			return new Node(x);
		if(x < root.data) {
			root.left = insert(root.left, x);
			root.lcount++;
		}
		else if(x > root.data)
			root.right = insert(root.right, x);
		return root;
	}
	static Node kthSmallest(Node root, int k) {
		if(root == null)
			return null;
		int count = root.lcount +1;
		if(count == k)
			return root;
		if(count>k)
			return kthSmallest(root.left,k);
		return kthSmallest(root.right, k-count);
	}
	public static void main(String[] args) {
		int keys[] = {20, 8, 22, 4, 12, 10, 14};
		for(int x : keys) {
			root = insert(root, x);
		}
		int k =4;
		Node res = kthSmallest(root, k);
		if(res == null)
			System.out.println("There are less than k nodes in BST");
		else
			System.out.println("Kth smallest is : " +res.data);
	}

}

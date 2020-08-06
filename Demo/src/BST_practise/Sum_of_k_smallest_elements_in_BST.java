package BST_practise;

public class Sum_of_k_smallest_elements_in_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static int count = 0, sum=0;
	static int sumOfK(Node node, int k) {
		if(node == null)
			return 0;
		sumOfK(node.left, k);
		sum+=node.data;
		count++;
		if(count==k)
			return sum;
		sumOfK(node.right, k);
		return -1;
	}
	public static void main(String[] args) {
		root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(11);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.left.left.right = new Node(3);	
		int k = 5;
		System.out.println(sumOfK(root, k));
	}

}

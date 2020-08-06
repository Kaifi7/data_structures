package binary_trees;

public class Height_binary_tree {

	static class Node{
		int data;
		Node left, right;
		Node(int item){
			data = item;
			left = right = null;
		}
	}
	static Node root;
	static int leftHeight =0;
	static int rightHeight =0;
	static int maxHeight =0;
	static int calHeight(Node root) {
		if(root == null)
			return 0;
		Node temp = root;
		while(temp.left!=null) {
			leftHeight++;
			temp = temp.left;
		}
		temp = root;
		while(temp.right!=null) {
			rightHeight++;
			temp = temp.right;
		}
		//System.out.println(leftHeight+" " +rightHeight);
		maxHeight = ((leftHeight>rightHeight)?leftHeight:rightHeight)+1;
		return maxHeight;
		
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("height of the tree is : ");
		System.out.print(calHeight(root));
		
	}

}

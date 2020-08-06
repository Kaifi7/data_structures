package binary_trees;

public class Sum_nodes_BT {

	static class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	static Node root, node, nod;
	static int sum = 0;
	static int addBT(Node temp){
		
		if(temp == null)
			return 0;
		//return node.key + addBT(node.left) + addBT(node.right);
		node = temp;
		nod = temp;
		while(node.left!=null) {
			sum+=node.key;
			System.out.print(node.key+ " ");
			node = node.left;
		}
		while(nod.right!=null) {
			sum+=nod.key;
			System.out.print(nod.key + " ");
			nod = nod.right;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		int sum = addBT(root);
		System.out.println("Sum of all the elements is : " +sum);
		
	}

}

package BST_practise;
public class Min_element_in_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node head;
	static Node insert(Node node, int data) {
		if(node == null)
			return (new Node(data));
		else {
			if(data <=node.data) {
				node.left = insert(node.left, data);
			}
			else {
				node.right = insert(node.right, data);
			}
			return node;
		}
	}
	static int minValue(Node node) {
		Node current = node;
		while(current.left!=null) {
			current = current.left;
		}
		return current.data;
	}
	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 4);
		insert(root, 2);
		insert(root, 1);
		insert(root, 3);
		insert(root, 6);
		insert(root, 5);
		System.out.println("Minimum value of BST is : " +minValue(root));
	}

}

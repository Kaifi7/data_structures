package BST_practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Print_BST_keys_in_given_range {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root;
	static Set<Integer>set = new HashSet<Integer>();
	static void printNodesInRange(Node node, int l, int h) {
		if(node !=null) {
			if(node.data >=l && node.data <=h) {
				System.out.print(node.data + " ");
				printNodesInRange(node.left, l, h) ;
				printNodesInRange(node.right, l, h);
			}
			else if(node.data < l)
				printNodesInRange(node.right, l, h);
			else if(node.data > h)
				printNodesInRange(node.left, l, h);
		}
	}
	static void inorder(Node node, int l, int h) {
		if(node == null)
			return;
		inorder(node.left, l, h);
			if(node.data >=l && node.data <=h)
				set.add(node.data);
		inorder(node.right, l, h);
		
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(50);
		root.left.left = new Node(1);
		root.right.left = new Node(40);
		root.right.right = new Node(100);
		int l = 5, h=50;
		printNodesInRange(root, l, h);
		System.out.println();
		inorder(root, l, h);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}

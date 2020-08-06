package binary_search_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_value_in_BST {

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
	static void insert(int key) {
		root =insertRec(root, key);
	}
	static Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key<root.data)
			root.left = insertRec(root.left, key);
		else if(key>root.data)
			root.right = insertRec(root.right, key);
		return root;
	}
	
	/*static int minValue(Node node) {
		Node current =node;
		while(current.left !=null) {
			current = current.left;
		}
		return current.data;
	}*/
	static int count = 0;
	static void minValue(Node node) {
		if(node != null) {
			minValue(node.left);
			count++;
			if(count==1) {
				System.out.println(node.data);
				return;
			}
			
		}
	}
		
	public static void main(String[] args) {
		insert(50);
		insert(30);
		insert(20);
		insert(40);
		insert(70);
		insert(60);
		insert(80);
		//System.out.println(inorder());
		//System.out.println("Min value is : " +minValue(root));;
		minValue(root);
	}

}

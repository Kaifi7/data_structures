package binary_trees;			//time complexity O(n)

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_traversal {
	
	static class Node{
		int data;
		Node left, right;
		Node(int item){
			data = item;
			left = right = null;
		}
	}
	
	static Node root;
	static Node tempNode;
	static void printLevelOrder() {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			
			if(tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		System.out.println("Level order traversal of binary tree is : ");
		printLevelOrder();
	}

}

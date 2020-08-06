package BST_practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Print_common_nodes_in_BST {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	static Node root1, root2;
	static HashMap<Integer, Integer> map = new HashMap<>();
	static Node insert(Node node, int key) {
		if(node == null)
			return (new Node(key));
		if(key < node.data)
			node.left = insert(node.left, key);
		else if(node.data < key)
			node.right = insert(node.right, key);
		return node;
	}
	static void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		if(!map.containsKey(root.data)) {
			map.put(root.data, 1);
		}
		else {
			int count = map.get(root.data)+1;
			map.put(root.data, count);
		}
		inorder(root.right);
	}
	static void printCommon(Node root1, Node root2) {
		Stack<Node>s1 = new Stack<Node>();
		Stack<Node>s2 = new Stack<Node>();
		while(true) {
			if(root1!=null) {
				s1.push(root1);
				root1 = root1.left;
			}
			else if(root2!=null) {
				s2.push(root2.left);
				root2 = root2.left;
			}
			else if(!s1.isEmpty() && !s2.isEmpty()) {
				root1 = s1.peek();
				root2 = s2.peek();
				if(root1.data == root2.data) {
					System.out.print(root1.data + " ");
					s1.pop();
					s2.pop();
				}
				else if(root1.data < root2.data) {
					s1.pop();
					root1 = root1.right;
					root2 = null;
				}
				else if(root1.data > root2.data) {
					s2.pop();
					root2 = root2.right;
					root1 = null;
				}
			}
			else break;
		}
	}
	static void printCom(HashMap<Integer, Integer>map) {
		for(Integer i : map.keySet()) {
			int count = map.get(i);
			if(count==2)
				System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		 	root1 = insert(root1, 5);  
		    root1 = insert(root1, 1);  
		    root1 = insert(root1, 10);  
		    root1 = insert(root1, 0);  
		    root1 = insert(root1, 4);  
		    root1 = insert(root1, 7);  
		    root1 = insert(root1, 9);  
		    
		    root2 = insert(root2, 10);  
		    root2 = insert(root2, 7);  
		    root2 = insert(root2, 20);  
		    root2 = insert(root2, 4);  
		    root2 = insert(root2, 9);
		    
		    System.out.print("Tree 1 : " + "\n");  
		    inorder(root1);  
		    System.out.println(); 
		    System.out.print("Tree 2 : " + "\n");  
		    inorder(root2);  
		    System.out.println(); 
		    System.out.println("Common Nodes: "); 
		   // printCommon(root1, root2);  
		    printCom(map);
	}

}

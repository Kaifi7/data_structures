package binary_trees;

class Node{
	int key;
	Node left, right;
	
	public Node(int item){
		key = item;
		left=right = null;
	}
}
public class Binary_tree_creation {
	Node root;
	Binary_tree_creation(int key){
		root = new Node(key);
	}	
	Binary_tree_creation(){
		root = null;
	}
	public static void main(String[] args) {
		Binary_tree_creation obj = new Binary_tree_creation();
		obj.root = new Node(1);
		obj.root.left =new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
	}

}

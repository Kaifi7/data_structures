
public class Check_BT_is_full {

	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left =null;
			right = null;
		}
	}
	static Node root;
	static boolean isFullTree(Node node) {
		if(node == null)
			return true;
		if(node.left == null && node.right == null)
			return true;
		if(node.left !=null && node.right!=null) {
			return (isFullTree(node.left) &&isFullTree(node.right));
		}
		return false;
	}
	public static void main(String[] args) {
		root = new Node(10); 
        root.left = new Node(20); 
        root.right = new Node(30); 
        root.left.right = new Node(40); 
        root.left.left = new Node(50); 
        root.right.left = new Node(60); 
        root.left.left.left = new Node(80); 
        root.right.right = new Node(70); 
        root.left.left.right = new Node(90); 
        root.left.right.left = new Node(80); 
        root.left.right.right = new Node(90); 
        root.right.left.left = new Node(80); 
        root.right.left.right = new Node(90); 
        root.right.right.left = new Node(80); 
        root.right.right.right = new Node(90); 
           
        if(isFullTree(root)) 
            System.out.print("The binary tree is full"); 
        else
            System.out.print("The binary tree is not full");
	}

}

package linked_list;

public class Segregate_even_and_odd_nodes_of_ll {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static void segregateEvenOdd() {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = head;
		while(currentNode!=null) {
			int element = currentNode.data;
			if(element%2==0) {
				if(evenStart == null) {
					evenStart = currentNode;
					evenEnd = evenStart;
				}
				else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}
			else {
				if(oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				}
				else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			currentNode = currentNode.next;
		}
		if(oddStart == null || evenStart == null) {
			return;
		}
		evenEnd.next= oddStart;
		oddEnd.next = null;
		head = evenStart;
	}
	public static void main(String[] args) {
		push(11); 
        push(10); 
        push(9); 
        push(6); 
        push(4); 
        push(1); 
        push(0); 
        System.out.println("Origional Linked List"); 
        printList(); 
        segregateEvenOdd(); 
        System.out.println("Modified Linked List"); 
        printList(); 
	}

}

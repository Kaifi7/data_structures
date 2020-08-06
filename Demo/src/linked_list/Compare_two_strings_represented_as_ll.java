package linked_list;

public class Compare_two_strings_represented_as_ll {

	static class Node{
		char data;
		Node next;
		Node(char d){
			data = d;
			next = null;
		}
	}
	static Node head1, head2;
	static int compare(Node a, Node b) {
		if(a == null && b == null)
			return 1;
		while(a!=null && b!=null && a.data == b.data) {
			a = a.next;
			b =b.next;
		}
		if(a!=null && b!=null) {
			System.out.println("aaaaaaaaaaaa");
			System.out.println((int)(a.data - 'a'));
			System.out.println((int)(b.data - 'a'));
			return ((int)(a.data - 'a') >((int)b.data - 'a') ? 1 : -1);
		}
		if(a!=null && b==null)
			return 1;
		if(a==null && b!=null)
			return -1;
		return 0;
	}
	public static void main(String[] args) {
		head1 = new Node('g');
		head1.next = new Node('e');
		head1.next.next = new Node('e');
		head1.next.next.next = new Node('k');
		head1.next.next.next.next = new Node('s');
		head1.next.next.next.next.next =new Node('b');
		
		head2 = new Node('g');
		head2.next = new Node('e');
		head2.next = new Node('e');
		head2.next.next = new Node('k');
		head2.next.next.next = new Node('s');
		head2.next.next.next.next = new Node('a');
		
		int value; 
        value = compare(head1, head2); 
        System.out.println(value); 
  
	}

}

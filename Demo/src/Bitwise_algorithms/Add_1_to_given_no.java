package Bitwise_algorithms;

public class Add_1_to_given_no {

	static int addOne(int n) {
		int m=1;
		while((int)(n&m) >=1 ) {
			n = n ^m;
			m<<=1;
		}
		n = n^m;
		return n;
	}
	public static void main(String[] args) {
        System.out.println(addOne(13)); 
	}

}

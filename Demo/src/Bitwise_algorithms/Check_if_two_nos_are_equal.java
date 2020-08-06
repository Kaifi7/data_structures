package Bitwise_algorithms;

public class Check_if_two_nos_are_equal {

	static void areSame(int a, int b) {
		if((a^b)!=0)
			System.out.println("Not Same");
		else
			System.out.println("Same");
	}
	public static void main(String[] args) {
		areSame(10, 20); 
	}

}

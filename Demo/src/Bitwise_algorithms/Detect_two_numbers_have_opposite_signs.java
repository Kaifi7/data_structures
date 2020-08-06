package Bitwise_algorithms;

public class Detect_two_numbers_have_opposite_signs {

	// sign bit is 1 in negative number and 0 in positive number, so xor will give 1 as sign bit for opp nos and 
	//resultant no will be negative
	
	static boolean oppositeSigns(int x, int y) {
		return ((x^y)<0);
	}
	public static void main(String[] args) {
		int x = 100, y = -100; 
        if (oppositeSigns(x, y) == true) 
            System.out.println("Signs are opposite"); 
        else
            System.out.println("Signs are not opposite"); 
	}

}

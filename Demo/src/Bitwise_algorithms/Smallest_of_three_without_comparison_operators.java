package Bitwise_algorithms;

public class Smallest_of_three_without_comparison_operators {

	static int smallest(int x, int y, int z) {
		if(x/y == 0) {
			return (x/z == 0)?x:z;
		}
		return (y/z ==0)?y:z;
	}
	public static void main(String[] args) {

        int x = 400, y = 200, z = 300; 
        System.out.printf("Minimum of 3 numbers"
                              + " is %d", 
                          smallest(x, y, z));
	}

}

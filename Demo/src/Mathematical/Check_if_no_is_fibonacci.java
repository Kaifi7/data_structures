package Mathematical;

public class Check_if_no_is_fibonacci {

	static boolean isPerfectSquare(int x) {
		int s = (int)Math.sqrt(x);
		return (s*s == x);
	}
	static boolean isFibonacci(int n) {
		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) 
            System.out.println(isFibonacci(i) ?  i +  " is a Fibonacci Number" : 
                                                 i + " is a not Fibonacci Number"); 
	}

}
//A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4) is a perfect square
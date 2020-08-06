package Mathematical;

import java.math.BigInteger;

public class Large_fibonacci_no_in_java {

	static BigInteger fib(int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c;
		for(int j=2; j<=n; j++) {
			c = a.add(b);
			a=b;
			b=c;
		}
		return a;
	}
	public static void main(String[] args) {
		 int n = 1000; 
	        System.out.println("Fibonacci of " + n + 
	            "th term" + " " +"is" +" " + fib(n));
	}

}

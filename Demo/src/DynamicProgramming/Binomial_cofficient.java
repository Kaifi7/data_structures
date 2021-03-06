package DynamicProgramming;

public class Binomial_cofficient {

	static int min(int a, int b) {
		return (a<b)?a:b;
	}
	static int binomialCoeff(int n, int k) {
		int C[][] = new int[n+1][k+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=min(i,k); j++) {
				if(j==0 || j==1)
					C[i][j]=1;
				else
					C[i][j] = C[i-1][j-1] + C[i-1][j];
			}
		}
		return C[n][k];
	}
	public static void main(String[] args) {
		 int n = 5, k = 2; 
		 System.out.println("Value of C("+n+","+k+") is "+binomialCoeff(n, k)); 
	}

}

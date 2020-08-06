package Strings;

public class Shortest_common_supersequence {

	static int shortestSuperSequence(String X, String Y) {
		int m = X.length();
		int n = Y.length();
		int lcs = findLCS(X, Y, m, n);
		return (m+n-lcs);
	}
	static int findLCS(String X, String Y, int m, int n) {
		int l[][] = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n;j++) {
				if(i==0 || j==0)
					l[i][j] =0;
				else if(X.charAt(i-1) == Y.charAt(j-1))
					l[i][j] = l[i-1][j-1]+1;
				else
					l[i][j] = Math.max(l[i-1][j], l[i][j-1]);
			}
		}
		return l[m][n];
	}
	public static void main(String[] args) {
		 String X = "AGGTAB"; 
		    String Y = "GXTXAYB"; 
		      
		    System.out.println("Length of the shortest " + 
		                             "supersequence is " + 
		                      shortestSuperSequence(X, Y));
	}

}

package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class Longest_common_subsequence {

	static int N = 100;
	static int L[][] = new int[N][N];
	static int LCS(String X, String Y, int m, int n) {
		
		for(int i=0; i<=m ; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0)
					L[i][j]=0;
				else if(X.charAt(i-1) == Y.charAt(j-1))
					L[i][j] = L[i-1][j-1] + 1;
				else
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
			}
		}
		return L[m][n];
	}
	
	public static void main(String[] args) {
		String X = "AGTGATG"; 
	    String Y = "GTTAG"; 
	    int m = X.length(); 
	    int n = Y.length(); 
	    System.out.println("LCS length is " + 
	                        LCS(X, Y, m, n)); 
	    //Set<String> s = findLCS(X, Y, m, n); 
	}

}

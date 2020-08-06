package Strings;

import java.util.HashSet;
import java.util.Set;

public class Print_all_longest_common_subsequence {

	static int N = 100;
	static int L[][] = new int[N][N];
	static int LCS(String X, String Y, int m, int n) {
		for(int i=0; i<=m; i++) {
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
	static Set<String>findLCS(String X, String Y, int m, int n){
		Set<String>s = new HashSet<>();
		if(m==0 || n==0) {
			s.add("");
			return s;
		}
		if(X.charAt(m-1) == Y.charAt(n-1)) {
			Set<String>temp = findLCS(X, Y, m-1, n-1);
			for(String str:temp)
				s.add(str+X.charAt(m-1));
		}
		else {
			if(L[m-1][n] >= L[m][n-1]) {
				s = findLCS(X, Y, m-1, n);
			}
			if(L[m][n-1] >= L[m-1][n]) {
				Set<String>tmp = findLCS(X, Y, m, n-1);
				s.addAll(tmp);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		 	String X = "AGTGATG"; 
		    String Y = "GTTAG"; 
		    int m = X.length(); 
		    int n = Y.length(); 
		  
		    System.out.println("LCS length is " + 
		                        LCS(X, Y, m, n)); 
		  
		    Set<String> s = findLCS(X, Y, m, n); 
		  
		    for (String str : s) 
		        System.out.println(str); 
	}

}

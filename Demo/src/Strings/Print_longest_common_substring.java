package Strings;

public class Print_longest_common_substring {

	static void printLCSubStr(String X, String Y, int m, int n) {
		int LCS[][] = new int [m+1][n+1];
		int len = 0;
		int row = 0, col = 0;
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0)
					LCS[i][j]=0;
				else if(X.charAt(i-1) == Y.charAt(j-1)) {
					LCS[i][j] = LCS[i-1][j-1] + 1;
					if(len < LCS[i][j]) {
						len = LCS[i][j];
						row = i;
						col = j;
					}
				}
				else
					LCS[i][j]=0;
			}
			
		}
		if(len == 0) {
			System.out.println("No Common Substring");
			return;
		}
		String resultStr = "";
		while(LCS[row][col]!=0) {
			resultStr = X.charAt(row-1) + resultStr;
			--len;
			row--;
			col--;
		}
		System.out.println(resultStr);
	}
	public static void main(String[] args) {
		String X = "OldSite:GeeksforGeeks.org"; 
        String Y = "NewSite:GeeksQuiz.com"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        printLCSubStr(X, Y, m, n);
	}

}

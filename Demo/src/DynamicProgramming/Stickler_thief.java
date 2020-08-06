package DynamicProgramming;

public class Stickler_thief {

	static int maxLoot(int hval[], int n) {
		if(n==0)
			return 0;
		if(n==1)
			return hval[0];
		if(n==2)
			return Math.max(hval[0], hval[1]);
		int dp[] = new int[n];
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0],hval[1]);
		for(int i=2; i<n; i++)
			dp[i] = Math.max(hval[i] + dp[i-2], dp[i-1]);
		return dp[n-1];
		
	}
	static int maxLootWithoutDp(int hval[] , int n) {
		if(n==0)
			return 0;
		int value1 = hval[0];
		if(n==1)
			return value1;
		int value2 = hval[1];
		if(n==2)
			return value2;
		int max_value = 0;
		for(int i=2; i<n; i++) {
			max_value = Math.max(hval[i]+value1,value2);
			value1 = value2;
			value2 = max_value;
		}
		return max_value;
	}
	public static void main(String[] args) {
		int hval[] = {6, 7, 1, 3, 8, 2, 4}; 
        int n = hval.length; 
        System.out.println("Maximum loot value : " + maxLoot(hval, n)); 
        System.out.println("Maximum loot value : " + maxLootWithoutDp(hval, n)); 
	}

}

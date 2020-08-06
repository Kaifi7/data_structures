package OS;

public class Bankers_algorithm {

	static int n = 5;
	static int m = 3;
	static int need[][] = new int[n][m];
	static int max[][];
	static int alloc[][];
	static int avail[];
	static int safeSequence[] = new int[n];
	static int count;
	static boolean visited[] = new boolean[n];
	static int work[] = new int [m];
	static void initializeValues() {
		alloc = new int[][] { {0, 1, 0 },     //P0
							  {2, 0, 0 },	  //P1
							  {3, 0, 2},	  //P2
							  {2, 1, 1},	  //P3
							  {0, 0, 2}		  //P4
								};
								
		max = new int[][] { {7, 5, 3},
							{3, 2, 2},
							{9, 0, 2},
							{2, 2, 2},
							{4, 3, 3},
							};
		
		avail = new int[] {3, 3, 2};
	}
	static void isSafe() {
		count  = 0;
	for(int i=0; i<n; i++) {
		visited[i] = false;
	 }
	for(int i=0; i<m; i++) {
		work[i] = avail[i];
	}
	while(count < n) {
		boolean flag = false;
		int j=0;
		for(int i=0; i<n; i++) {
			if(visited[i] == false) {
				for(j=0; j<m; j++) {
					if(need[i][j]> work[j])
						break;
				}
				if(j==m) {
					safeSequence[count++]=i;
					visited[i]=true;
					flag= true;
					for(j=0; j<m; j++) {
						work[j]= work[j] + alloc[i][j];
					}
				}
			}
		}
		if(flag==false)
			break;
	}
		if(count < n)
			System.out.println("system is unsafe");
		else {
			System.out.println("Following is safe sequence : ");
			for(int i=0; i<n; i++) {
				System.out.print("P" +safeSequence[i]);
				if(i!=n-1)
					System.out.print(" -> ");
			}
		}
 }
	static void calculateNeed() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				need[i][j] = max[i][j]-alloc[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		initializeValues();
		calculateNeed();
		isSafe();
	}

}

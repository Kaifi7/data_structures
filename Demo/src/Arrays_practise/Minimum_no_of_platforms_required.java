package Arrays_practise;

import java.util.Arrays;

public class Minimum_no_of_platforms_required {

	static int findPlatform(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int plat_needed = 1, result = 1;
		int i=1, j=0;
		while(i<n &&j<n) {
			if(arr[i]<=dep[j]) {
				plat_needed++;
				i++;
			}
			else if(arr[i]> dep[j]) {
				plat_needed--;
				j++;
			}
			if(plat_needed > result)
				result = plat_needed;
		}
		return result;
	}
	static int minPlatform(int arr[], int dep[], int n) {
		int platform[] = new int[2361];
		int requiredPlatform = 1;
		for(int i=0; i<n; i++) {
			++platform[arr[i]];
			--platform[dep[i]];
		}
		for(int i=1; i<2361; i++) {
			platform[i] = platform[i] + platform[i-1];
			requiredPlatform = Math.max(requiredPlatform, platform[i]);
		}
		return requiredPlatform;
	}
	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1110, 1115, 1500, 1800 }; 
        int dep[] = { 910, 1200, 1120, 1130, 1140, 1145,1900, 2000 }; 
        int n = arr.length; 
        System.out.println("Minimum Number of Platforms Required = "
                           + findPlatform(arr, dep, n)); 
        System.out.println("Minimum Number of Platforms Required = "
                + minPlatform(arr, dep, n));
	}

}

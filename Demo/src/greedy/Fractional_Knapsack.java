package greedy;

import java.util.Arrays;
import java.util.HashMap;

public class Fractional_Knapsack {

	private static double getMaxValue(int wt[], int val[], int capacity) {
		double array[] = new double[wt.length];
		HashMap<Double, Integer>map = new HashMap<Double, Integer>();
		for(int i=0; i<wt.length; i++) {
			array[i] = val[i]/wt[i];
			map.put(array[i], wt[i]);
		}
		Arrays.sort(array);
		double profit =0;
		for(int i=array.length-1; i>=0; i--) {
			if(map.get(array[i])<=capacity) {
				profit+=array[i]*map.get(array[i]);
				capacity-=map.get(array[i]);
			}
			else if(map.get(array[i])> capacity && capacity !=0) {
				profit+= capacity * array[i];
				break;
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int[] wt = {10, 40, 20, 30}; 
        int[] val = {60, 40, 100, 120}; 
        int capacity = 50; 
  
        double maxValue = getMaxValue(wt, val, capacity); 
        System.out.println("Maximum value we can obtain = " +  
                            maxValue); 
	}

}

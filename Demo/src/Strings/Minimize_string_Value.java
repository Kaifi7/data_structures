package Strings;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Minimize_string_Value {

	static final int MAX_CHAR = 26;
	static class IntCompare implements Comparator<Integer>{
		public int compare(Integer arg0, Integer arg1) {
			if(arg0 > arg1)
				return -1;
			else if(arg0 < arg1)
				return 1;
			else
				return 0;
		}
	}
	static int minimize(String s, int k) {
		int l = s.length();
		if(k>=l)
			return 0;
		int freq[] = new int[MAX_CHAR];
		for(int i=0; i<l; i++) {
			freq[s.charAt(i)-'a']++;
		}
		Comparator<Integer>c = new IntCompare();
		PriorityQueue<Integer>q = new PriorityQueue<>(c);
		for(int i=0; i<MAX_CHAR; i++) {
			if(freq[i]!=0)
				q.add(freq[i]);
		}
		while(k!=0) {
			int temp = q.peek();
			q.poll();
			temp = temp-1;
			q.add(temp);
			k--;
		}
		int result = 0;
		while(!q.isEmpty()) {
			int temp = q.peek();
			result+=temp*temp;
			q.poll();
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "aaab";
		int k = 2;
		System.out.println(minimize(s, k));
	}

}

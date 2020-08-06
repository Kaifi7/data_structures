package Strings;

import java.util.HashMap;

public class Maximum_occuring_ch_lexicographically {

	static void maxOccur(String str) {
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		int maxcount=0;
		int arr[] = new int[26];
		for(int i=0; i<26; i++)
			arr[i]=0;
		for(int i=0; i<str.length(); i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
				arr[str.charAt(i)-'a']=1;
			}
			else {
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count+1);
				arr[str.charAt(i) - 'a']=count+1;
				if((count+1)>maxcount)
					maxcount = (count+1);
			}
		}
		System.out.println(maxcount);
		for(int i=0; i<26; i++) {
			if(arr[i]==maxcount) {
				System.out.println((char)(i+'a'));
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		String str = "ouooteeeeeputttoot";
		maxOccur(str);
	}

}

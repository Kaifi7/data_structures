package Strings;

import java.util.HashSet;

public class Remove_all_duplicates_from_string {

	static void removeDuplicates(String str) {
		HashSet<Character>hM = new HashSet<Character>();
		String temp = str;
		str="";
		for(int i=0; i<temp.length();i++) {
			if(temp.charAt(i)==' ')
				str+=" ";
			if(!hM.contains(temp.charAt(i)) && temp.charAt(i)!=' ') {
				str+=temp.charAt(i);
				hM.add(temp.charAt(i));
			}
		}
		System.out.println(str.substring(0, str.length()));
	}
	public static void main(String[] args) {
		String str = "geeksforgeeks imsp ssa";
		removeDuplicates(str);
	}

}

package Strings;

import java.util.HashSet;

public class Count_Steps {

	static void minimalSteps(String ingr) {
		String s = null;
		HashSet<String>hs = new HashSet<String>();
		for(int i=0; i<ingr.length(); i++) {
			s += ingr.charAt(i);
			hs.add(s);
		}
	}
	public static void main(String[] args) {

	}

}

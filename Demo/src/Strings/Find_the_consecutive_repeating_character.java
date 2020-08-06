package Strings;

public class Find_the_consecutive_repeating_character {

	static void maxRepeating(String str) {
		int count=1,maxcount=-1;
		int n = str.length();
		char max = str.charAt(0);
		for(int i=0; i<str.length(); i++) {
			if(i<n-1 && str.charAt(i) == str.charAt(i+1))
				count++;
			else
			{
				if(count>maxcount) {
					maxcount = count;
					max = str.charAt(i);
				}
					count=1;
			}
		}
		System.out.println(max + " "+ maxcount);
	}
	public static void main(String[] args) {
		String str = "aaaaabbbbbbcbbbddddddd";
		maxRepeating(str);
	}

}

package Strings;

public class All_characters_of_string_are_same_or_not {

	static boolean allCharactersSame(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)!=s.charAt(i+1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "aaa"; 
	    if (allCharactersSame(s)) 
	        System.out.println("Yes"); 
	    else
	        System.out.println("No");
	}

}

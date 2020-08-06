package Strings;

public class Find_one_extra_character {

	public static char findExtraCharacter(String s1, String s2) {
		String smallStr;
		String largeStr;
		if(s1.length()>s2.length()) {
			smallStr = s2;
			largeStr = s1;
		}
		else {
			smallStr = s1;
			largeStr = s2;
		}
		int smallStrCodeTotal =0;
		int largeStrCodeTotal =0;
		int i=0;
		for(; i<smallStr.length(); i++) {
			smallStrCodeTotal += smallStr.charAt(i);
			largeStrCodeTotal += largeStr.charAt(i);
		}
		largeStrCodeTotal += largeStr.charAt(i);
		int intChar = largeStrCodeTotal - smallStrCodeTotal;
		return (char)intChar;
	}
	public static void main(String[] args) {
		String s1 = "abcd"; 
        String s2 = "cbdae"; 
          
        char extraChar = findExtraCharacter(s1, s2); 
        System.out.println("Extra character: " + extraChar);
	}

}

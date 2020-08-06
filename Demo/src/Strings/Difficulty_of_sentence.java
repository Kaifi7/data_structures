package Strings;

public class Difficulty_of_sentence {

	static boolean isVowel(char a) {
		if(a=='a' || a=='i' || a=='e' || a=='o' || a=='u') {
			return true;
		}
		else
			return false;
	}
	static int countv=0, countcc=0,countc=0, counth=0, counts=0;
	static void findDifficulty(String s) {
		for(int i=0; i<s.length();i++) {
			if(isVowel(s.charAt(i)) && s.charAt(i)!=' ') {
				countv++;
				countcc=0;
			}
			else if(!isVowel(s.charAt(i)) && s.charAt(i)!=' ') {
				countc++;
				countcc++;
			}
			else if(s.charAt(i) == ' ') {
				System.out.println(countcc + " " +countv + " " + countc);
				if(countcc==4 || countc>countv)
					counth++;
				else
					counts++;
				countc=0;
				countv=0;
				countcc=0;
			}
		}
		if(countcc==4 || countc>countv)
			counth++;
		else counts++;
		System.out.println(5*counth + 3*counts);
	}
	public static void main(String[] args) {
		String s = "Difficulty of sentence";
		String str = s.toLowerCase();
		findDifficulty(str);
	}

}

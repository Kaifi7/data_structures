package Strings;

public class Count_words_in_string_with_separator {

	static final int OUT=0;
	static final int IN =1;
	static void countWords(String str) {
		int state = OUT;
		int wc = 0;
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
				state = OUT;
			else if(state == OUT) {
				state = IN;
				++wc;
			}
			i++;
		}
		System.out.println(wc);
	}
	public static void main(String[] args) {
		String str = "One two       three\n four\tfive"; 
		countWords(str);
	}

}

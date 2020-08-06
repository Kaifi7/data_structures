package Strings;

public class Reverse_each_word_in_a_given_string {

	static void reverse(String s) {
		String temp[]  = s.split(" ");
		String res="";
		for(int i=temp.length-1; i>=0; i--) {
			res+=temp[i]+" ";
		}
		System.out.println(res.substring(0, res.length()));
	}
	public static void main(String[] args) {
		String s = "I like this program very much";
		reverse(s);
	}

}

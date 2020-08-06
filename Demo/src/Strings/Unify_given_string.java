package Strings;

public class Unify_given_string {

	static void replaceSpace(String s) {
		String str[] = s.split(" ");
		String temp ="";
		for(int i=0; i<str.length-1; i++) {
			temp +=str[i];
			temp+="%20";
		}
		temp+=str[str.length-1];
		System.out.println(temp.substring(0, temp.length()));
		
	}
	public static void main(String[] args) {
		String s = "Mr John Smith ";
		String str = "Mr John Smith";
		str = str.trim();
		str = str.replaceAll("\\s", "%20");
		System.out.println(str);
		replaceSpace(s);
	}

}

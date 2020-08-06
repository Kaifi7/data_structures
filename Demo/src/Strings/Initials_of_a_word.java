package Strings;

public class Initials_of_a_word {

	static void printInitials(String name) {
		if(name.length() == 0)
			return;
		System.out.print(Character.toUpperCase(name.charAt(0)) + " ");
		for(int i=1; i<name.length();i++) {
			if(name.charAt(i-1) == ' ') {
				System.out.print(Character.toUpperCase(name.charAt(i)) + " ");
			}
		}
	}
	public static void main(String[] args) {
		String name = "prabhat kumar singh"; 
        printInitials(name); 
	}

}

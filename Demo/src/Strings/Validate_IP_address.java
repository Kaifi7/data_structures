package Strings;

public class Validate_IP_address {

	static void checkValidity(String s) {
		int count = 0;
		String temp ="";
		for(int i=0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!='.') {
				System.out.println("Not valid");
				return;
			}
			if(s.charAt(i)=='0') {
				if(temp==null || temp=="") {
					System.out.println("Not valid");
					return;
				}
				int num = Integer.parseInt(temp);
				if(num==0) {
					System.out.println("Not valid");
					return;
				}
				
			}
			if(s.charAt(i)!='.') {
				temp+=s.charAt(i);
			}
			else {
				count++;
				if(count>3) {
					System.out.println("Not valid");
					return;
				}
				
				int num = Integer.parseInt(temp);
				if(num>=0 && num<=255) {
					temp="";
					continue;
				}
				else {
					System.out.println("Not valid");
					return;
				}
			}
		}
		if(temp!=null) {
			int num = Integer.parseInt(temp);
			if(num>=0 && num<=255) {
				System.out.println("valid");
				return;
			}
			else {
				System.out.println("Not valid");
				return;
			}
		}
			
	}
	public static void main(String[] args) {
		String s = "125.210.10.100";
		checkValidity(s);
	}

}

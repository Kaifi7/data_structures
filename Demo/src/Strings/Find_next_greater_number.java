package Strings;

public class Find_next_greater_number {

	static void findNext(String s, int n) {
		int i;
		for(i=n-1; i>=0; i--) {
			if(s.charAt(i)>s.charAt(i-1))
				break;
		}
		if(i==0) {
			System.out.println("Not possible");
		}
		else {
			int x = s.charAt(i-1);
			int min =i;
			for(int j=i+1; j<n; j++) {
				if(s.charAt(j)>x && s.charAt(j)<s.charAt(min))
					min = j;
			}
			//swap(s, i-1, min);
		}
		
	}
	
	public static void main(String[] args) {
		String digit = "534976";
		int n = digit.length();
		findNext(digit, n);
	}

}

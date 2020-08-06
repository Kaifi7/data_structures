package Strings;

public class Replace_the_bit {

	static int replace(int num, int k) {
		String temp = "";
		 temp = findBinary(num);
		 if(temp.charAt(k-1) == '0')
			return num;
		 else {
			 temp = temp.substring(0, k-1) + '0' +temp.substring(k, temp.length());
			  return findDecimal(temp);
		 }
		 
	}
	static int findDecimal(String s) {
		int dec=0, j=0;
		for(int i=s.length()-1; i>=0; i--) {
			int val = (s.charAt(i) == '0')?0:1;
			dec += Math.pow(2, j++)* val;
		}
		return dec;
	}
	static String findBinary(int num) {
		String temp ="";
		while(num>0) {
			temp+=num%2;
			num = num/2;
		}
		StringBuilder sb = new StringBuilder(temp);
		String s = sb.reverse().toString();
		return s;
	}
	public static void main(String[] args) {
		int num = 7;
		int k = 2;
		System.out.println(replace(num, k));
	}

}

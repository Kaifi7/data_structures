package Arrays_practise;

public class Replace_zero_with_5_in_input {

	public static void main(String[] args) {
		int number = 10020;
		String s = String.valueOf(number);
		StringBuilder ss = new StringBuilder(s);
		String newS = s.replaceAll("0", "5");
		System.out.println(newS);
	}

}

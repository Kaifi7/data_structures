package Bitwise_algorithms;

public class Position_of_rightmost_setbit {

	static int positionRightmostSetbit(int n) {
		int count =0;
		int pos=0;
		while(n>0) {
			count+=n&1;
			n>>=1;
			if(count==0)
				pos++;
			else
				break;
		}
		return pos+1;
	}
	public static void main(String[] args) {
		int n = 12;
        System.out.println(positionRightmostSetbit(n));
	}

}

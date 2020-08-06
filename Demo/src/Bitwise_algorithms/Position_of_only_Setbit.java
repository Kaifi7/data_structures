package Bitwise_algorithms;

public class Position_of_only_Setbit {

	static int findPosition(int n) {
		int count =0;
		int pos=0;
		while(n>0) {
			count += n&1;
			n>>=1;
			if(count==0)
				pos++;
		}
		return (count==1)?pos+1:-1;
	}
	public static void main(String[] args) {
		int n = 0; 
        int pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number"); 
        else
            System.out.println("n = " + n + ", Position " + pos); 
  
        n = 12; 
        pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number"); 
        else
            System.out.println("n = " + n + ", Position " + pos); 
  
        n = 128; 
        pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number"); 
        else
            System.out.println("n = " + n + ", Position " + pos);
	}

}

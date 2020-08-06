package Strings;

public class Does_robot_moves_circular {

	static boolean isCircular(char path[]) {
		int x = 0, y = 0;
		int dir = 0;
		for(int i=0; i<path.length; i++) {
			char move = path[i];
			if(move == 'R')
				dir = (dir+1)%4;
			else if(move == 'L')
				dir = (4+dir-1)%4;
			else {
				if(dir==0)
					y++;
				else if(dir == 1)
					x++;
				else if(dir == 2)
					y--;
				else
					x--;
			}
		}
		return (x == 0 && y == 0);
	}
	public static void main(String[] args) {
		String path_ = "GLGLGLG"; 
	    char path[] = path_.toCharArray(); 
	  
	    if (isCircular(path)) 
	      System.out.println("Given sequence" + 
	      " of moves is circular"); 
	    else
	      System.out.println("Given sequence" + 
	      " of moves is NOT circular"); 
	}

}

package OOPS;

class one{
	public void print_geek() {
		System.out.println("Geeks");
	}
}
class two extends one{
	public void print_for() {
		System.out.println("For");
	}
}
public class SingleI_Inheritance {

	public static void main(String[] args) {
		two i = new two();
		i.print_geek();
		i.print_for();
		i.print_geek();
	}

}

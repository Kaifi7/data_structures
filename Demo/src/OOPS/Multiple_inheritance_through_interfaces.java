package OOPS;

interface one_a{
	public void print_geek();
}
interface two_b{
	public void print_for();
}
class three_c implements one_a, two_b{
	public void print_geeks() {
		System.out.println("geeks");
	}

	@Override
	public void print_for() {
		System.out.println("for");
	}

	@Override
	public void print_geek() {
		System.out.println("geek");
	}
}

public class Multiple_inheritance_through_interfaces {

	public static void main(String[] args) {
		three_c obj = new three_c();
		obj.print_geek();
		obj.print_for();
		obj.print_geeks();
	}

}

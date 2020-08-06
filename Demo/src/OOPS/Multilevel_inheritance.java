package OOPS;

class one_m{
	public void print_geek() {
		System.out.println("geek");
	}
}
class two_m extends one_m {
	public void print_for() {
		System.out.println("for");
	}
}
class three extends two{
	public void print_geeks() {
		System.out.println("geeks");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		three obj = new three();
		obj.print_geek();
		obj.print_for();
		obj.print_geeks();
	}

}
// In java a class cannot directly access grandparent's members
// java doesnot support multiple inheritance with classes. In java we can achieve multiple inheritance through interfaces.

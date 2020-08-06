package OOPS;

class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement){
		speed -=decrement;
	}
	public void seedUp(int increment) {
		speed +=increment;
	}
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}
class MountainBike extends Bicycle{
	public int height;
	public MountainBike(int gear, int speed, int height) {
		super(gear, speed);
		this.height = height;
	}
	public void setHeight(int newValue) {
		height = newValue;
	}
	@Override
	public String toString() {
		return (super.toString() + "MountainBike [height=" + height + "]");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}

}

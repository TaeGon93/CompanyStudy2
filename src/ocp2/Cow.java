package ocp2;

public class Cow implements Animal2{

	@Override
	public void sleep() {
		System.out.println("소가 잔다");
	}
	public static void main(String[] args) {
		Animal2 cow = new Cow();
		cow.sleep();
	}
}

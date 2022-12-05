package ocp2;

public class Bird implements Animal2{

	@Override
	public void sleep() {
		System.out.println("새가 잔다");
	}
	
	public static void main(String[] args) {
		Animal2 bird = new Bird();
		bird.sleep();
	}
}

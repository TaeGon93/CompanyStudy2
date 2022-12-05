package dip;

public class Main {
	public static void main(String[] args) {
		Toy t = new Robot();
		Kid k = new Kid();
		k.setToy(t);
		k.play();
		
		Toy c = new ToyCar();
		k.setToy(c);
		k.play();
	}
}

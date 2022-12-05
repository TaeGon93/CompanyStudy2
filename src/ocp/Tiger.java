package ocp;

public class Tiger extends Animal{

	public Tiger(String animal) {
		super(animal);
	}
	public static void main(String[] args) {
		Animal tiger = new Tiger("호랑이");
		tiger.cry();
	}
}

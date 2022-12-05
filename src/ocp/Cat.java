package ocp;

public class Cat extends Animal{

public Cat(String animal) {
		super(animal);
	}

	//	public Cat(String animal) {
//		super(animal);
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public void cry() {
//		System.out.println("야옹");
//	}
//	public static void main(String[] args) {
//		Animal cat = new Cat();
//		cat.cry();
//	}
	public static void main(String[] args) {
		Animal cat = new Cat("고양이");
		cat.cry();
	}
}

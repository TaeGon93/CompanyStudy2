package ocp;

public class Dog extends Animal{
public Dog(String animal) {
		super(animal);
	}

	//	public Dog(String animal) {
//		super(animal);
//	}
	public static void main(String[] args) {
		Animal dog = new Dog("강아지");
		dog.cry();
	}
//	@Override
//	public void cry() {
//		System.out.println("멍멍");
//	}
//	public static void main(String[] args) {
//		Animal dog = new Dog();
//		dog.cry();
//	}
	
}

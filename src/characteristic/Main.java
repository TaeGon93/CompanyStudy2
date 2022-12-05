package characteristic;

public class Main {

	public static void main(String[] args) {
		Animal bird = new Bird("맹금류", "독수리", "5.5kg");
		bird.eat();
		bird.sleep();
		bird.move();
		bird.move(bird);
		System.out.println(bird.getAnimalType()+","+bird.getName()+","+bird.getWeight());
		
		System.out.println();
		
		Animal dog = new Dog("강아지", "말티즈", "2.7kg");
		dog.eat();
		dog.sleep();
		dog.move();
		dog.move(dog);
		System.out.println(dog.getAnimalType()+","+dog.getName()+","+dog.getWeight());
	}
}

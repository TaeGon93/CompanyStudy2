package ocp;

public class Animal {
	//개방폐쇄의 원칙은 기능을 추가할 때 기존의 코드를 변경하지않고도 기능을 추가할 수 있어야한다
private String animal;

	public Animal(String animal) {
		super();
		this.animal = animal;
	}

	public String getAnimal() {
	return animal;
}

	public void setAnimal(String animal) {
		this.animal = animal;
	}


	public void cry() {
		//추가될때마다 변경해주어야함 //변경은 ocp원칙에 위배됨
		if(animal.equals("강아지")) {
			System.out.println("멍멍");
		}
		if(animal.equals("고양이")) {
			System.out.println("야옹");
		}
	}
}

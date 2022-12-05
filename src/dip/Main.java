package dip;

public class Main {
	public static void main(String[] args) {
		//의존역전원칙 : 변동가능성이 적은 상위클래스,인터페이스,추상클래스 의존
		Toy t = new Robot();
		Kid k = new Kid();
		k.setToy(t);
		k.play();
		
		Toy c = new ToyCar();
		k.setToy(c);
		k.play();
	}
}

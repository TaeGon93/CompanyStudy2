package srp;

public class EightEngineCar extends Car1{

	@Override
	public void move(int engine) {
		if(engine==8) {
			System.out.println("8기통 자동차");
		}
	}

}

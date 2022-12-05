package srp;

public class SixEngineCar extends Car1{

	@Override
	public void move(int engine) {
		if(engine==6) {
			System.out.println("6기동 자동차");
		}
	}
	
}

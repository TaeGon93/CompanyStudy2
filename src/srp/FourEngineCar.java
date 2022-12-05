package srp;

public class FourEngineCar extends Car1{

	@Override
	public void move(int engine) {
		if(engine==4) {
			System.out.println("4기통 자동차");
		}
	}


}

package dip;

public class Kid {
	private Toy toy;

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}
	
	public void play() {
		System.out.println(toy+"을 가지고논다.");
	}
}

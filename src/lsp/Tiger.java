package lsp;

public class Tiger extends Animal2{
	@Override
	void sleep() {
		System.out.println("호랑이가 잔다");
	}
	public static void main(String[] args) {
		Animal2 tiger1 = new Tiger();
		tiger1.sleep();
		
		Animal2 ani = new Animal2();
		ani.sleep();
	}
}

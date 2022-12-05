package lsp;

public class Animal2 {
	//자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행이 보장되어야 한다는 의미 // 다형성 원리
	//설계시 관련된 클래스만 상속받도록 설계해야한다.
	void sleep() {
		System.out.println("잔다");
	}
}

package ch08.sec10.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언
		A a;
		
		// 변수에 구현 객체 대입
		a = b;		// A <-- B
		a = c;		// A <-- C
		a = d;		// A <-- D
		a = e;		// A <-- E
	}
}


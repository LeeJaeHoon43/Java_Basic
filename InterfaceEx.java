/*
# 인터페이스
- 자바에서 크게 클래스와 인터페이스로 나눈다.
* 형식
[접근제한] interface [인터페이스명]{
	// 멤버변수로 가질 수 있는 변수는 상수 뿐이다.
	상수;
	// 멤버 메서드로 가질 수 있는 메서드는 추상 메서드 뿐이다.
	추상메서드;
}
- 역시 객체를 만들 수 없어서 다형성을 이용해 객체를 만들어야 한다.
- 클래스가 클래스를, 인터페이스가 인터페이스를 상속받을 때는 extends, 클래스가 인터페이스를 상속받을 때는 implements라고 쓴다.
- 여러 개를 상속받는 것을 다중 상속이라고 한다. 클래스는 단일 상속만 되지만 인터페이스는 다중 상속이 가능하다.
- 다중 상속을 위해 인터페이스를 만들었다. 
*/
interface InterEx{
	
	static final int A = 100; // 상수.
	
	// 추상메서드
	abstract int getA(); // abstract 예약어는 생략 가능.
}

public class InterfaceEx implements InterEx{ 
	@Override
	public int getA(){
		return A;
	}
	public static void main(String[] args){
		InterfaceEx if1 = new InterfaceEx(); // 객체 생성.
		System.out.println("getA() : " + if1.getA());
	}
}

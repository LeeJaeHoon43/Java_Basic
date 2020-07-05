public class MyStatic{
	// 멤버
	private int x;
	private static int y; // static 변수.

	// static 초기화 구문 : static 변수는 이 구문 안에서만 초기화 할 수 있다.
	static{
		y = 5; // 5로 초기화.
	}

	// 생성자.
	MyStatic(){
		x = 5;
		y = 10; // 여기서는 초기화 개념이 아니라 값을 바꾸는 개념이다.
	}

	// getter, setter 메서드는 static을 생략하고 사용할 수 있다.
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public static void main(String[] args){
		System.out.println("y = " + y); // 5 출력
		MyStatic ms = new MyStatic(); // 객체 생성.
		System.out.println("x = " + ms.getX()); // 5 출력
		System.out.println("y = " + ms.getY()); // 10 출력
		// System.out.println("y = " + MyStatic.getY()); // 에러 발생 : getter, setter는 클래스명으로 하지 않아도 된다.
	}
}

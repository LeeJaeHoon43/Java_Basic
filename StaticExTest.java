class StaticEx{

	int x;
	static int y;

	// static 초기화 구문.
	static{
		y = 10;
	}

	// Static 클래스 안에서는 getter, setter메서드와 같이 static을 선언하지 않아도 static변수를 사용 가능하다.
	public void aaa(){
		System.out.println(y);// static 클래스의 멤버 메서드는 예외.
	}
}
public class StaticExTest{
	public static void main(String[] args){
		System.out.println("StaticEx.y : " + StaticEx.y); // static으로 초기화한 10이 출력된다.
		StaticEx.y = 100; // y의 값을 100을 변경.
		StaticEx se = new StaticEx(); // 객체 생성.
		System.out.println("se.x : " + se.x); // 에러. (객체를 발생시켜야 한다.) -> 객체를 생성하면 0이 출력된다.
		System.out.println("StaticEx.y : " + StaticEx.y); // 100 출력.
		se.x = 50; // x의 값 50으로 변경.
		StaticEx se1 = new StaticEx(); // 새로운 객체 생성1 : x = 0, y = 0 으로 초기화.
		System.out.println(se1.x); // 0 출력
		System.out.println(se1.y); // 100 출력
		se.y = 150; // y의 값 50으로 변경.
		StaticEx se2 = new StaticEx(); // 새로운 객체 생성2 : x = 0, y = 0 으로 초기화.
		System.out.println(se2.x); // 0 출력
		System.out.println(se2.y); // 150 출력
		se2.aaa(); // 150 출력
		System.out.println("se1.y : " + se1.y); // 150
		System.out.println("se2.y : " + se2.y); // 150
		System.out.println("StaticEx.y : " + StaticEx.y); // 150
	}
}
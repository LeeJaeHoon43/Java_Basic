// 부모 클래스
class ParentEx{
	int foo = 5;
	public int getNumber(int a){
		return a + 1;
	}
}
// 자식 클래스
public class SonEx extends ParentEx{
	int foo = 7;
	public int getNumber(int a){
		return a + 2;
	}
	public static void main(String[] args) {
		ParentEx pe = new SonEx(); // 다형성을 적용한 객체 생성.
		System.out.println(pe.getNumber(0)); // 결과 : 2 = 다형성은 메서드(기능)는 자식 클래스의 메서드를 사용한다.
		System.out.println(pe.foo); // 결과 : 5 = 다형성은 멤버 변수는 부모 클래스의 맴버 변수를 사용한다.
	}
}

abstract class AbsEx1{
	int a = 100; // 변수.
	final String str = "abstract test"; // 상수.
	public String getStr(){ // 일반 메서드
		return str;
	}

	// 추상 메서드는 몸체(body)가 없다.
	abstract public int getA();
}
abstract class AbsEx2 extends AbsEx1{
	public int getA(){ // 부모 클래스(AbsEx1)의 추상 메서드 오버라이딩.
		return a; // 100 리턴.
	}
	public abstract String getStr();
}
public class AbsEx extends AbsEx2{
	public String getStr(){ // AbsEx2의 추상 메서드 오버라이딩.
		return str; // str은 AbsEx1의 멤버 변수이다.
	}
	public static void main(String[] args){
		AbsEx ae = new AbsEx(); // 객체 생성.
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
	}
}

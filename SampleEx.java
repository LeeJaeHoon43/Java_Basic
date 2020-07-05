class Sample{ // Sample.java 파일도 자동으로 생성된다.
	// 멤버 변수.
	private int x; // private : 은닉화.
	int y;

	// 생성자는 생략되어있지만, public Sample(){}가 자동으로 생성되어 있다. -> default Constructor (기본 생성자).
	
	// 캡슐화.
	// getter, setter 메서드 만들기.
	public int getX(){
		return x;
	}
	public void setX(int value){
		this.x = value;
	}
}

public class SampleEx{ // file명도 public을 가진 클래스 이름으로 만든다. SampleEx.java
	public static void main(String[] ar){
		Sample sp = new Sample();
		System.out.println(sp.getX()); // getter()메서드를 통해 private인 x의 값을 가져온다. (캡슐화)
		// 자바에서 포함 멤버들이 각각 접근 지정자를 가진다.
		// 자바에서 클래스의 멤버 변수는 자동으로 초기화된다.
		// 앞에서 배열을 보면 new로 생성 -> new로 초기화하는 것들은 자동 초기화된다.
		// 객체도 new로 초기화하는데 클래스의 멤버 변수들을 해당 타입의 기본값으로 자동으로 초기화한다.
		// 한 파일에 클래스가 여러 개 있을때는 public이 붙을 수 있는 클래스는 main클래스 하나이다.
	}
}
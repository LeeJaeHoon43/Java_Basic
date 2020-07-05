class Super {

	public Super(){
		System.out.println("상위 클래스 생성자");
	}


	public Super(int x){
		System.out.println("상위 클래스 생성자 : " + x);
	}
}

class Sub extends Super{
	public Sub(){
		// super(); 가 생략되어 있다.
		//super(5);
		System.out.println("하위 클래스 생성자");
	}
}
public class SuperEx2{
	public static void main(String[] args) {
		Sub sub = new Sub(); // 객체 생성.
	}
}

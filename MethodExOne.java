class MethodEx{
	// 멤버 변수 생략.

	// 생성자 생략

	// 메서드
	public int sum(int i, int j){
		return i + j;
	}
	public int sub(int i, int j){
		return i - j;
	}
	public int multi(int i, int j){
		return i * j;
	}
	public int divi(int i, int j){
		return i / j;
	}
}

public class MethodExOne{
  	public static void main(String[] args) {
		MethodEx ref = new MethodEx(); // 객체 생성.
		int i = 10;
		int j = 10;
		System.out.println("더한 값 : " + ref.sum(i,j));
		System.out.println("뺸 값 : " + ref.sub(i,j));
		System.out.println("곱한 값 : " + ref.multi(i,j));
		System.out.println("나눈 값 : " + ref.divi(i,j));
	}
}

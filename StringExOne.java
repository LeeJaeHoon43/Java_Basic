public class StringExOne {
	public static void main(String[] args) {
		/*
		# String 클래스.
		- 문자열을 의미하는 클래스.
		- 가장 많이 쓰이는 클래스 중의 하나.
		- 객체 자료형이지만 기본 자료형처럼 사용한다.
		
		 * String 클래스 생성자.
		 -String() : 비어 있는 	문자열 객체를 생성하고 초기화.
		 -String(char[] value) : 인자인 char배열 value의 내용을 순차적으로 배정하여 새로운 문자열을 생성.
		 -String(String original) : String형의 original의 문자열을 새롭게 생성된 문자열 객체에 초기화.
		 
		 * 객체 생성법
		 1. 암시적 객체 생성 : String s1 = "Test";
		 2. 명시적 객체 생성 : String s2 = new String("Test");
		 
		 - ==연산자는 객체의 주소값을 비교한다.
		 - 객체의 값 비교는 .equals()메서드를 이용한다.
		*/
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		if(s1 == s2) // s1.equals(s2)
			System.out.println("s1과 s2는 같다.");
		else
			System.out.println("s1과 s2는 같지 않다.");
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		if(s3 == s4) // s3.equals(s4)
			System.out.println("s1과 s2는 같다.");
		else
			System.out.println("s1과 s2는 같지 않다.");
	}
}
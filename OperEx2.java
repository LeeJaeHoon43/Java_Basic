public class OperEx2{
	public static void main(String[] args) {
		short a, b;
		a = b = 10; // a = 10; b = 10;
		short c = (short)(a + b);
		// 자바에서는 정수(byte, short, int)간의 사칙연산의 결과는 
		// 반드시 정수(int)가 나온다
		// byte b = 127; b++; b = b+1;
		System.out.println("c의 값 : " + c);
	}
}
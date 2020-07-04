public class OperEx1{
	public static void main(String[] args) {
		int x = 10;
		int y = ++x; // 전위 증가 연산자.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int a = 10;
		int b = a++; // 후위 증가 연산자.
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
	}
}
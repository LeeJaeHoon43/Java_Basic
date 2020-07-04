public class OperEx5{
	public static void main(String[] args) {
		boolean a;
		boolean b;
		if((a = 4 > 3) | (b = 5 > 7)){
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		// short circuit : &&일 경우 false출력, ||일 경우 true출력, 실행 속도가 빠르다.
		// &, | 사용하면 다 실행 후 결과 출력 실행 속도가 느리다.
		// 그러나 |로 고치면 a = true, b = fasle 출력.
	}
}
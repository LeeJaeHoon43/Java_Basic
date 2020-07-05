public class StaticInner{
	
	int a = 10; // 멤버 변수.
	private int b = 100;
	static int c = 200;
	
	static class Inner{ // static 이너 클래스.
		// 어쩔수 없이 이너 클래스를 static으로 선언해야 하는 경우가 있다.
		// 이너 클래스의 멤버들 중 하나라도 static멤버가 있을 경우.
		static int d = 1000;
		public void	printData(){
				// System.out.println("int a : " + a); // 오류
				// System.out.println("private int b : " + b); // 오류
				System.out.println("static int c : " + c);
				System.out.println("static int d : " + d);
		}
	}

	public static void main(String[] args){
		// 또 다른 독립된 객체에서 static 이너 클래스 생성 시.
		// 외부 클래스를 통해 이너 클래스 객체를 생성해야 메서드를 사용할 수 있다.
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
	}
}


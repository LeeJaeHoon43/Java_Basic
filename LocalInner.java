class LocalInner{
	int a = 100; // 멤버 변수.
	public void innerTest(int k){
		int b = 200; // 지역 변수.
		final int c = k; // 상수
		class Inner{
			// Local 이너 클래스는	외부 클래스의 멤버 변수와 상수들만 접근이 가능하다
			public void getData(){
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				// Local 이너 클래스는 지역변수를 사용할 수 있다.
				System.out.println("final int c : " + c); // 상수 사용.
			}
		} // 이너 클래스 끝.
		Inner i = new Inner(); // 메소드 내에서 Local 이너 클래스 생성.
		i.getData(); // 생성된 reference를 통해 메서드 호출.
	} // 메서드의 끝.
	public static void main(String[] args){
		LocalInner outer = new LocalInner();
		outer.innerTest(1000);
	}
}

class MethodExTwo{
	// 멤버 변수들.
	int var1, var2;

	// 메서드 (멤버 함수)
	public int sum(int a, int b){ 
		return a + b;
	}

  	public static void main(String[] args) {
		// 메서드의 문제점 1 : 메서드는 리턴값을 하나의 값만 돌려받는다.
		MethodExTwo me = new MethodExTwo();
		int res = me.sum(1000, -10); 
		System.out.println("res = " + res);
	}
}

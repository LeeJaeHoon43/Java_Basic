class MethodExThree{
	// 멤버 변수.
	int var;

	// getter, setter 메서드.
	public void setVar(int var){
		var = var; // 문제 발생 = 메서드의 문제점 2 : 전역변수랑 지역변수가 공존할 때 지역변수를 우선으로 한다.
	}
	public int getVar(){
		return var;
	}

  	public static void main(String[] args) {
		MethodExThree me = new MethodExThree();
		me.setVar(1000); 
		System.out.println("var = " + me.getVar()); // 자동 초기화된 전역변수 var의 값인 0이 출력된다.
	}
}
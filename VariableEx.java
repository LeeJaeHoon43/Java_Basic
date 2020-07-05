public class VariableEx{
	public void argTest(String ... n){
		// 메소드 정의 시 통일된 인자의 자료형에 ...라고 명시하므로 이를 통해 메소드를 수행하는데 필요한 인자 수를 유연하게 구현할 수 있다.
		// 내부적으로 배열화 작업을 자동적으로 해준다.
		for(int i = 0; i<n.length; i++)
			System.out.println("n[" + i + "] : " + n[i]);
		System.out.println("-------------------------------------");

	}
	public static void main(String[] args) {
		VariableEx ve = new VariableEx();
		ve.argTest("Varargs", "Test");
		ve.argTest("100","600","900","1000");
	}
}
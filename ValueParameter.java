public class ValueParameter{
	public int increase(int n){
		++n;
		return n;
	}
	public static void main(String[] args) {
		// 값 호출 (Call by value)
		// 메서드를 호출 시 기본 자료형의 값을 인자로 전달하는 방식.
		int var1 = 100;
		ValueParameter vp = new ValueParameter();
		int var2 = vp.increase(var1);
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
	}
}
public class ReferenceParameter{
	public void increase(int[] n){
		for(int i = 0; i<n.length; i++){
			n[i]++;
		}
	}
	public static void main(String[] args) {
		// 참조 호출 (Call by reference)
		// 메서드 호출 시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우를 의미한다. 
		// 여기에는 기본 자료형이 아닌 일반 객체 또는 배열들이 여기에 속한다.
		int[] ref1 = {100, 800, 1000};
		ReferenceParameter rp = new ReferenceParameter();
		rp.increase(ref1);
		for(int i = 0; i < ref1.length; i++){
			System.out.println("ref1[" + i + "] : " + ref1[i]);
		}
	}
}
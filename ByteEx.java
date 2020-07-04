public class ByteEx{
	public static void main(String[] ar){
		byte bb = 127; // -128 ~ 127
		bb++; // bb = bb + 1;
		// 변수를 초기화할때는 반드시 그 자료형의 표현 범위를 초과할 수 없다.
		System.out.println("byte bb = " + bb);
	}
}
public class WriteEx{
	public static void main(String[] ar){
		System.out.write(65); // write는 byte형의 자료를 출력한다.
		// 배열이 아닌 수를 출력할 때는 flush()를 통해 출력해야 한다.
		// write(byte b); write(byte[] b);
		// write(byte[] b, int start, int length);
		System.out.flush(); // 버퍼에 있는 것을 출력.
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by, 0, 4);
		// 바이트 배열 사용의 경우에는 오토플러시 기능이 있다.
		System.out.println();
		// write의 경우 바이트 형식으로 데이터를 전송하기 때문에 주로 네트워크에서 많이 쓴다.
	}
}

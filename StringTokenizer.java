public class StringTokenizer{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		// 기본 buffer 용량 16에 입력한 문자열만큼 더한 16 + 10 = 26이됨.
		System.out.println("sb의 buffer용량은? : " + sb.capacity()); // 26
		System.out.println("sb의 문자열의 길이는? : " + sb.length()); // 10
		sb.append("ABCDEFGHIJKLMNOPQ");
		// 기존의 buffer용량인 26에 2를 더하고 다시 더함 : 26 + (26 + 2) =54
		System.out.println("sb의 buffer용량은? : " + sb.capacity()); // 54 
		System.out.println("sb의 문자열의 길이는? : " + sb.length()); // 27
		sb.delete(1,20);
		// buffer의 용량은 줄어들지 않음.
		System.out.println("sb의 buffer 용량은? : " + sb.capacity()); // 54
		System.out.println("sb의 문자열의 길이는? : " + sb.length()); // 8
	}
}
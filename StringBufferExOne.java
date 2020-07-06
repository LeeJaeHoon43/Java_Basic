public class StringBufferExOne {
	public static void main(String[] args) {
		/*
		* StringBuffer 클래스.
		- 내부적으로 직접 변경이 가능한 클래스.
		- 문자열의 변경이 자주 사용되는 객체일수록 이 클래스를 사용한다.
		
		* 버퍼.
		- 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리 영역이다.
		- 버퍼링이란 버퍼를 활용하는 방식 또는 버퍼를 채우는 동작을 뜻한다.
		
		* StringBuffer 메서드.
		- capacity() : 현재 용량(버퍼의 길이)를 ing형으로 반환한다.
		- append(String str) : 현재 StringBuffer 객체에 인자로 전달된 str을 덧붙임.
		- delete(int start, int end) : 시작과 끝 인덱스 사이의 문자열을 삭제한다.
		- insert(int offset, String str) : 원하는 인덱스에 문자열을 삽입한다.
		- replace(int start, int end, String str) : 시작 인덱스와 끝 인덱스 사이의 문자열을 다른 문자열로 변환한다.
		- setLength(int newLength) : 새 길이만큼 문자열의 길이를 다시 설정한다.
		- toString() : StringBuffer객체가 가지고 있는 문자열을 String형으로 변환한다.
		*/
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("1.6");
		System.out.println(sb); // JAVA1.6
		sb.delete(3,5); 
		System.out.println(sb); // JAV.6
		sb.insert(3,"A1");
		System.out.println(sb); // JAVA1.6
		sb.replace(4,7,"일점육");
		System.out.println(sb); // JAVA일점육
		sb.reverse();
		System.out.println(sb); // 육점일AVAJ
	}
}
